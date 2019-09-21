package XSDStitch.FanfictionDatabase.GUI.addnew;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class NewEditStoryIdea {

	private String columnsetting = "pref, 3dlu, pref:grow";
	private String rowSetting = "pref:grow, 2dlu, pref:grow, 2dlu, pref:grow, 2dlu, pref:grow";

	private JLabel franchise = new JLabel("Franchise/Title");
	private JLabel type = new JLabel("Type");
	private JLabel details = new JLabel("Details");

	private JTextField franchiseTextField = new JTextField(30);
	private JTextField typeTextField = new JTextField(30);
	private JTextArea detailsTextArea = new JTextArea(5, 30);

	private JButton save = BasicComponents.buttomSave();

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout = new FormLayout(columnsetting, rowSetting);
	private JPanel newEditStoryIDPanel = new JPanel(layout);
	private JFrame newEditStoryIDFrame = new JFrame("Add Idea");

	public NewEditStoryIdea() {

		layout.setRowGroups(new int[][] { { 1, 3 } });

		newEditStoryIDPanel.setBorder(Borders.DLU4);

		setComponents();

		setFrame();

	}

	private void setFrame() {
		newEditStoryIDFrame.add(newEditStoryIDPanel);
		newEditStoryIDFrame.setSize(550, 250);
		newEditStoryIDFrame.setVisible(true);
	}

	private void setComponents() {
		newEditStoryIDPanel.add(franchise, cc.xy(1, 1));
		newEditStoryIDPanel.add(franchiseTextField, cc.xy(3, 1));

		newEditStoryIDPanel.add(type, cc.xy(1, 3));
		newEditStoryIDPanel.add(typeTextField, cc.xy(3, 3));

		newEditStoryIDPanel.add(details, cc.xy(1, 5));
		newEditStoryIDPanel.add(detailsTextArea, cc.xy(3, 5));

		newEditStoryIDPanel.add(save, cc.xyw(1, 7, 3, "center, center"));
	}
}
