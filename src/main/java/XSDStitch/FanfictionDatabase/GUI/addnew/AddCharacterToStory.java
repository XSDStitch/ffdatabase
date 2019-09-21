package XSDStitch.FanfictionDatabase.GUI.addnew;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class AddCharacterToStory {

	private JLabel character = new JLabel("Character");
	private JLabel role = new JLabel("Role");
	private JLabel status = new JLabel("status");

	private JComboBox<String> characterChoice = new JComboBox<String>(new String[] { "Kuran" });
	private JComboBox<String> characterStatus = new JComboBox<String>(new String[] { "Alive" });

	private JTextArea roleTextfield = BasicComponents.textarea();

	private JButton save = BasicComponents.buttonNew();

	private String columnsetting = "pref, 3dlu, pref:grow";
	private String rowSetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout = new FormLayout(columnsetting, rowSetting);
	private PanelBuilder addCharactertoChapterPanel;
	private JFrame addCharactertoChapterFrame = new JFrame("Add Character to Story");

	public AddCharacterToStory() {

		addCharactertoChapterPanel = new PanelBuilder(layout);
		addCharactertoChapterPanel.border(Borders.DLU4);

		setComponents();

		setFrame();

	}

	private void setFrame() {
		addCharactertoChapterFrame.add(addCharactertoChapterPanel.getPanel());
		addCharactertoChapterFrame.setSize(550, 250);
		addCharactertoChapterFrame.setVisible(true);
	}

	private void setComponents() {
		addCharactertoChapterPanel.add(character, cc.xy(1, 1));
		addCharactertoChapterPanel.add(characterChoice, cc.xy(3, 1));

		addCharactertoChapterPanel.add(role, cc.xy(1, 3));
		addCharactertoChapterPanel.add(roleTextfield, cc.xy(3, 3));

		addCharactertoChapterPanel.add(status, cc.xy(1, 5));
		addCharactertoChapterPanel.add(characterStatus, cc.xy(3, 5));

		addCharactertoChapterPanel.add(save, cc.xyw(1, 7, 3, "center, center"));
	}
}
