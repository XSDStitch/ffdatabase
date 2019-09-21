package XSDStitch.FanfictionDatabase.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class Franchise {

	private String columnsetting = "pref:grow, 3dlu, pref:grow, ";
	private String rowSetting = "pref:grow, 3dlu, pref:grow";

	private JButton close = BasicComponents.buttonClose();
	private JButton newFranchise = BasicComponents.buttonNew();

	private JTable franchiseTable;

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout = new FormLayout(columnsetting, rowSetting);
	private JPanel franchisePanel  = new JPanel(layout);
	private JFrame franchiseFrame = new JFrame("Franchise");

	public Franchise() {
		// layout.setRowGroups(new int[][] { { 1 }, { 3 } });

		setTable();


		setComponents();

		setFrame();
	}

	private void setFrame() {
		franchiseFrame.add(franchisePanel);
		franchiseFrame.setSize(300, 500);
		franchiseFrame.setVisible(true);
	}

	private void setComponents() {
		franchisePanel.add(new JScrollPane(franchiseTable), cc.xyw(1, 1, 3));

		franchisePanel.add(close, cc.xy(1, 3));
		franchisePanel.add(newFranchise, cc.xy(3, 3));
	}

	private void setTable() {
		franchiseTable = new JTable(new String[][] { { "Kingdom Hearts", "Square Enix" }, { "Pokemon", "Nintendo" } },
				new String[] { "Name", "Owner" });
	}

}
