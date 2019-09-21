package XSDStitch.FanfictionDatabase.GUI.addnew;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class NewFranchise {
	private String columnsetting = "pref, 3dlu, pref:grow";
	private String rowSetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	
	private JLabel franchise = new JLabel("Name");
	private JLabel owner = new JLabel("Owner");

	private JTextField franchiseTextField = BasicComponents.textfield();
	private JTextField typeTextarea =  BasicComponents.textfield();

	private JButton save = new JButton("Save");

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout = new FormLayout(columnsetting, rowSetting);
	private JPanel newEditStoryIDPanel = new JPanel(layout);
	private JFrame newEditStoryIDFrame = new JFrame("New Franchise");	

	public NewFranchise() {

		setGroups();

		setBorder();

		setComponents();

		setFrame();
	}

	private void setBorder() {
		newEditStoryIDPanel.setBorder(Borders.DLU4);
	}

	private void setFrame() {
		newEditStoryIDFrame.add(newEditStoryIDPanel);
		newEditStoryIDFrame.setSize(550, 125);
		newEditStoryIDFrame.setVisible(true);
	}

	private void setComponents() {
		newEditStoryIDPanel.add(franchise, cc.xy(1, 1));
		newEditStoryIDPanel.add(franchiseTextField, cc.xy(3, 1));

		newEditStoryIDPanel.add(owner, cc.xy(1, 3));
		newEditStoryIDPanel.add(typeTextarea, cc.xy(3, 3));

		newEditStoryIDPanel.add(save, cc.xyw(1, 5, 3, "center, center"));
	}

	private void setGroups() {
		layout.setRowGroups(new int[][] { { 1, 3 } });
	}
}

