package XSDStitch.FanfictionDatabase.GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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

public class SingleItem {
	private String row = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	private String col = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	private JLabel name = new JLabel("Name");
	private JLabel user = new JLabel("User");
	private JLabel discription = new JLabel("discription");
	private BufferedImage image = null;
	private JTextField nameField = BasicComponents.textfield();
	private JTextField userField = BasicComponents.textfield();
	private JTextArea discriptionField = BasicComponents.textarea();
	private JButton close = BasicComponents.buttonClose();
	private FormLayout layout = new FormLayout(col, row);
	private CellConstraints cc = new CellConstraints();
	private int[][] rowGroups = { { 1, 3 } };

	private JPanel main = new JPanel(layout);
	private JFrame item = new JFrame("Item");

	public SingleItem() {
		layout.setRowGroups(rowGroups);
		main.setBorder(Borders.DLU4);

		setPanel();

		setFrame();
	}

	private void setFrame() {
		item.add(main);
		item.setSize(600, 250);
		item.setVisible(true);
	}

	private void setPanel() {
		main.add(name, cc.xy(1, 1));
		main.add(nameField, cc.xy(3, 1));
		main.add(getImage(), cc.xywh(5, 1, 1, 5));

		main.add(user, cc.xy(1, 3));
		main.add(userField, cc.xy(3, 3));

		main.add(discription, cc.xy(1, 5));
		main.add(discriptionField, cc.xy(3, 5));

		main.add(close, cc.xy(3, 7, "center, center"));
	}

	private JLabel getImage() {

		try {
			image = ImageIO.read(new File("test2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new JLabel(new ImageIcon(image));
	}

}
