package XSDStitch.FanfictionDatabase.GUI;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class Person {
	private String columnsetting = "pref, 3dlu, pref:grow, 3dlu, pref:grow";
	private String rowSetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	private JLabel name = new JLabel("Name");
	private JLabel website = new JLabel("Primary Website");

	private JTextField nameTextField = BasicComponents.textfield();
	private JLabel websiteLInk = new JLabel("www.google.de");

	private JLabel picture;

	private JButton close = BasicComponents.buttonClose();

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout = new FormLayout(columnsetting, rowSetting);
	private JPanel personPanel = new JPanel(layout);
	private JFrame personFrame = new JFrame("Person");

	public Person() {

		setGroups();

		setBorder();

		setComponents();

		setFrame();
	}

	private void setBorder() {
		personPanel.setBorder(Borders.DLU4);
	}

	private void setFrame() {
		personFrame.add(personPanel);
		personFrame.setSize(550, 125);
		personFrame.setVisible(true);
	}

	private void setComponents() {
		personPanel.add(name, cc.xy(1, 1));
		personPanel.add(nameTextField, cc.xy(3, 1));

		personPanel.add(website, cc.xy(1, 3));
		personPanel.add(websiteLInk, cc.xy(3, 3));

		personFrame.add(setPicture(), cc.xywh(5, 1, 1, 3));

		personPanel.add(close, cc.xyw(1, 5, 3, "center, center"));
	}

	private Component setPicture() {
		Image image = null;
		try {
			image = ImageIO.read(new File("test2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ImageIcon icon = new ImageIcon(image);
		picture = new JLabel(icon);
		return picture;
	}

	private void setGroups() {
		layout.setRowGroups(new int[][] { { 1, 3 } });
	}
}
