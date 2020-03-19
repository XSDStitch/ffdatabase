package XSDStitch.FanfictionDatabase.GUI.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public abstract class StoryFrame {
	protected String columnsetting = "pref, 3dlu, pref:grow, 3dlu, pref:grow";
	protected String rowSetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	protected String[] characterColumns = {"Name", "Role", "Status"};
	protected String[] chapterColumns = {"Number", "Title", "State"};

	protected CellConstraints cc = new CellConstraints();
	protected FormLayout layout = new FormLayout(columnsetting, rowSetting);
	protected PanelBuilder baseStoryPanel = new PanelBuilder(layout);
	protected JFrame baseStoryFrame;

	protected JLabel titel = new JLabel("Title");
	protected JTextField titleField = BasicComponents.textfield();
	protected JLabel franchise = new JLabel("Franchise");
	protected JLabel status = new JLabel("Status");
	protected JTextField statusField = BasicComponents.textfield();
	protected JLabel characters = new JLabel("Characters");
	protected JButton addCharacter = new JButton("Add Character");
	protected JTable characterTable;
	protected JButton addChapter = new JButton("Add Chapter");
	protected JTable chapterTable;
	protected JLabel picture;
	protected JLabel sequel = new JLabel("Sequel");
	protected JTextField sequelText = BasicComponents.textfield();
	protected JLabel prequel = new JLabel("Prequel");
	protected JTextField prequelText = BasicComponents.textfield();

	public StoryFrame() {
		baseStoryPanel.add(titel, cc.xy(1, 1));
		baseStoryPanel.add(titleField, cc.xy(3, 1));

		baseStoryPanel.add(franchise, cc.xy(1, 3));

		baseStoryPanel.add(status, cc.xy(1, 5));
		baseStoryPanel.add(statusField, cc.xy(3, 5));

		baseStoryPanel.add(characters, cc.xy(1, 7));
		baseStoryPanel.add(addCharacter, cc.xy(1, 9));

		baseStoryPanel.add(addChapter, cc.xy(1, 13));

		baseStoryPanel.add(addSequel(), cc.xy(7, 9));
		baseStoryPanel.add(addPrequel(), cc.xy(7, 13));
	}

	private JPanel addPrequel() {
		return newPanel("Prequel");
	}

	private JPanel addSequel() {
		return newPanel("Sequel");
	}

	protected void addImage() {
		baseStoryPanel.add(picture, cc.xywh(7, 1, 1, 5));
	}

	private JPanel newPanel(String label) {
		JPanel container = new JPanel(new FormLayout("pref:grow", "pref:grow, pref"));
		container.add(new JLabel(label), cc.xy(1, 1));
		container.add(BasicComponents.textfield(), cc.xy(1, 2));
		container.setBorder(Borders.DLU2);

		return container;
	}
	
	protected void setCharacterTable(String[][] rowData) {
		characterTable = new JTable(rowData, characterColumns);
		baseStoryPanel.add(characterTable, cc.xywh(5, 7, 1, 3));
	}
	
	protected void setChapterTable(String[][] rowData) {
		chapterTable = new JTable(rowData, chapterColumns);
		
	}

}
