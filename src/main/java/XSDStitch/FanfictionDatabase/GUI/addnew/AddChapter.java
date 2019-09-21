package XSDStitch.FanfictionDatabase.GUI.addnew;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class AddChapter {

	private JLabel title = new JLabel("Title");
	private JLabel status = new JLabel("Status");
	private JLabel file = new JLabel("File");

	private JTextField titleTextField = BasicComponents.textfield();
	private JTextField statusTextfield = BasicComponents.textfield();
	private JTextField fileTextfield = BasicComponents.textfield();

	private JButton choose = BasicComponents.buttonChoose();
	private JButton save = BasicComponents.buttomSave();

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout;
	private PanelBuilder addChapterPanel;
	private JFrame addChapterFrame = new JFrame("Add Chapter");

	private String columnsetting = "pref, 3dlu, pref:grow, 3dlu, min:grow";
	private String rowSetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	public AddChapter() {

		setLayout();

		setPanel();

		setComponentns();

		setFrame();

	}

	private void setFrame() {
		addChapterFrame.add(addChapterPanel.getPanel());
		addChapterFrame.setSize(550, 250);
		addChapterFrame.setVisible(true);
	}

	private void setComponentns() {
		addChapterPanel.add(title, cc.xy(1, 1));
		addChapterPanel.add(titleTextField, cc.xy(3, 1));

		addChapterPanel.add(status, cc.xy(1, 3));
		addChapterPanel.add(statusTextfield, cc.xy(3, 3));

		addChapterPanel.add(file, cc.xy(1, 5));
		addChapterPanel.add(fileTextfield, cc.xy(3, 5));
		addChapterPanel.add(choose, cc.xy(5, 5));

		addChapterPanel.add(save, cc.xyw(1, 7, 5, "center, center"));
	}

	private void setPanel() {
		addChapterPanel = new PanelBuilder(layout);
		addChapterPanel.border(Borders.DLU4);
	}

	private void setLayout() {
		layout = new FormLayout(columnsetting, rowSetting);
		layout.setRowGroups(new int[][] { { 1, 3 } });
	}

}
