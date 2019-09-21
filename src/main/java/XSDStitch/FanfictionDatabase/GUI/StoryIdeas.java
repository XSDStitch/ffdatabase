package XSDStitch.FanfictionDatabase.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class StoryIdeas {

	private JButton close = BasicComponents.buttonClose();
	private JButton addidea = BasicComponents.buttonNew();
	private JButton edit = BasicComponents.buttonEdit();
	private JButton delete = new JButton("Delete");

	private JTable storyIdeaTable;

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout;
	private JPanel storyIdeaPanel;
	private JFrame storyIdeaFrame = new JFrame("Story Ideas");

	private String columnsetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	private String rowSetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	public StoryIdeas() {
		layout = new FormLayout(columnsetting, rowSetting);

		storyIdeaTable = new JTable(
				new String[][] { { "Kingdom Hearts", "Story", "XXX" }, { "Pokemon", "Plot", "ABC" } },
				new String[] { "For", "Type", "Details" });

		storyIdeaPanel = new JPanel(layout);
		storyIdeaPanel.setBorder(Borders.DLU14);

		storyIdeaPanel.add(new JScrollPane(storyIdeaTable), cc.xyw(1, 1, 5));

		storyIdeaPanel.add(addidea, cc.xy(1, 3));
		storyIdeaPanel.add(edit, cc.xy(3, 3));
		storyIdeaPanel.add(delete, cc.xy(5, 3));

		storyIdeaPanel.add(close, cc.xyw(1, 5, 5, "center, center"));

		storyIdeaFrame.add(storyIdeaPanel);
		storyIdeaFrame.setSize(900, 600);
		storyIdeaFrame.setVisible(true);
	}
}
