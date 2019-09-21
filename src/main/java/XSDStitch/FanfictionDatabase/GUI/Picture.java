package XSDStitch.FanfictionDatabase.GUI;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class Picture {
	private String rows = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	private String columns = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout = new FormLayout(columns, rows);
	private JPanel picturePanel = new JPanel(layout);
	private JFrame pictureFrame = new JFrame("Picture");

	private JLabel title = new JLabel("Title");
	private JTextField titleField = BasicComponents.textfield();
	private JLabel artist = new JLabel("Artist");
	private JTextField artistField = BasicComponents.textfield();
	private JLabel nsfw = new JLabel("NSFW");
	private JCheckBox nsfwCheck = new JCheckBox();
	private JLabel price = new JLabel("Price");
	private JFormattedTextField priceField = new JFormattedTextField(NumberFormat.getCurrencyInstance());
	private JLabel characters = new JLabel("Characters");
	private JTable charactersList = new JTable(new String[][] { { "Hallo" }, { "Kuran" } }, new String[] { "Names" });
	private JLabel type = new JLabel("Type");
	private JTextField typeField = BasicComponents.textfield();

	private JLabel picture = setPicture();

	private JButton export = new JButton("Export");
	private JButton edit = BasicComponents.buttonEdit();
	private JButton close = BasicComponents.buttonClose();

	public Picture() {
		layout.setRowGroup(1, 3, 5, 7, 11);

		picturePanel.add(title, cc.xy(1, 1));
		picturePanel.add(titleField, cc.xy(3, 1));
		picturePanel.add(picture, cc.xywh(5, 2, 3, 8));

		picturePanel.add(artist, cc.xy(1, 3));
		picturePanel.add(artistField, cc.xy(3, 3));

		picturePanel.add(nsfw, cc.xy(1, 5));
		picturePanel.add(nsfwCheck, cc.xy(3, 5));

		picturePanel.add(price, cc.xy(1, 7));
		picturePanel.add(priceField, cc.xy(3, 7));

		picturePanel.add(characters, cc.xy(1, 9));
		picturePanel.add(charactersList, cc.xy(3, 9));

		picturePanel.add(type, cc.xy(1, 11));
		picturePanel.add(typeField, cc.xy(3, 11));

		picturePanel.add(export, cc.xywh(5, 11, 3, 1));

		picturePanel.add(edit, cc.xy(5, 13));
		picturePanel.add(close, cc.xy(7, 13));

		pictureFrame.setSize(500, 500);
		picturePanel.setBorder(Borders.DLU4);
		pictureFrame.setVisible(true);

	}

	private JLabel setPicture() {
		Image image = null;
		try {
			image = ImageIO.read(new File("test2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ImageIcon icon = new ImageIcon(image);
		return new JLabel(icon);
	}

}
