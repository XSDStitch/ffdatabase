package XSDStitch.FanfictionDatabase.GUI.Frame;

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

public class ListFrames {

	protected FormLayout layout;
	private JMenuBar bar = new JMenuBar();
	private JMenuItem newObject = new JMenuItem("New");
	private JFrame frame;
	protected CellConstraints cc = new CellConstraints();
	protected PanelBuilder builder;

	public ListFrames() {
		super();
	}

	protected void setFrame(String type) {
		bar.add(newObject);
		frame = new JFrame(type);
		frame.setJMenuBar(bar);
		frame.add(new JScrollPane(builder.getPanel(), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS));
		frame.setSize(800, 800);
		frame.setVisible(true);
	}

	protected JPanel setSingleList() {
		JPanel franchise = new JPanel(new GridLayout(0, 5));
		for (int i = 0; i < 10; i++) {
			franchise.add(container());
		}
		return franchise;
	}

	private JPanel container() {
	
		JPanel container = new JPanel(new FormLayout("pref:grow", "pref:grow, pref"));
		container.add(preview(), cc.xy(1, 1));
		container.add(new JButton("Test"), cc.xy(1, 2));
		container.setBorder(Borders.DLU2);
	
		return container;
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