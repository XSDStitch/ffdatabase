package XSDStitch.FanfictionDatabase.GUI;

import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class CharaList {
	private FormLayout layout;
	private JMenuBar bar = new JMenuBar();
	private JMenuItem newObject = new JMenuItem("New");
	private JFrame frame;
	private CellConstraints cc = new CellConstraints();
	private String rows = "pref:grow, 3dlu, pref:grow, 3dlu ,pref:grow, 3dlu, pref:grow";
	private String col = "pref:grow";
	private PanelBuilder builder;

	public CharaList() {
		layout = new FormLayout(col, rows);
		builder = new PanelBuilder(layout);
		builder.addSeparator("Franchise A", cc.xy(1, 1));
		builder.add(setFranchise(), cc.xy(1, 3));
		builder.addSeparator("Franchise B", cc.xy(1, 5));
		builder.add(setFranchise(), cc.xy(1, 7));

		bar.add(newObject);

		frame = new JFrame("Test");
		frame.setJMenuBar(bar);
		frame.add(new JScrollPane(builder.getPanel(), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS));
		frame.setSize(800, 800);
		frame.setVisible(true);

	}

	public JPanel setFranchise() {
		JPanel franchise = new JPanel(new GridLayout(0, 5));
		for (int i = 0; i < 10; i++) {
			franchise.add(story());
		}
		return franchise;
	}

	private JPanel story() {

		JPanel story = new JPanel(new FormLayout("pref:grow", "pref:grow, pref"));
		story.add(preview(), cc.xy(1, 1));
		story.add(new JButton("Test"), cc.xy(1, 2));
		story.setBorder(Borders.DLU2);

		return story;
	}

	private JLabel preview() {
		return new JLabel(getImage());
	}

	private Icon getImage() {
		Image image = null;
		try {
			image = ImageIO.read(new File("test2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ImageIcon(image);
	}
}
