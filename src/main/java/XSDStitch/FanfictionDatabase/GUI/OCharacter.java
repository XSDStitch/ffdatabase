package XSDStitch.FanfictionDatabase.GUI;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class OCharacter {

	private static final String COLUMNSETTING = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	private static final String ROWSETTING = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	private JLabel name = new JLabel("Name");
	private JTextField nameText = BasicComponents.textfield();
	private JLabel species = new JLabel("Species");
	private JTextField speciesText = BasicComponents.textfield();
	private JLabel franchise = new JLabel("Franchise");
	private JTextField franchiseText = BasicComponents.textfield();
	private JLabel firstAppearance = new JLabel("First Appearance");
	private JTextField appearanceText = BasicComponents.textfield();
	private JLabel owner = new JLabel("Owner");
	private JTextField ownerText = BasicComponents.textfield();
	private JLabel relationships = new JLabel("Relationships");
	private JTable relationshipsTable;
	private JLabel description = new JLabel("Descripion");
	private JTextArea descriptionText = BasicComponents.textarea();

	private JLabel picture;
	private JLabel gender = new JLabel("gender");
	private JTextField genderText = new JTextField(15);
	private JButton item = new JButton("Items");
	private JButton otherForms = new JButton("Other Forms");
	private JButton picturegallery = new JButton("Pictures");

	private JButton edit = BasicComponents.buttonEdit();
	private JButton close = BasicComponents.buttonClose();
	private JButton delete = BasicComponents.buttonDelete();

	private JFrame characterPage = new JFrame("Character");
	private FormLayout layout = new FormLayout(COLUMNSETTING, ROWSETTING);
	private CellConstraints cc = new CellConstraints();
	private JPanel userPanel = new JPanel(layout);

	private String[] title = { "Name", "Type", "Story" };

	public OCharacter() {

		userPanel.add(name, cc.xy(1, 1));
		userPanel.add(nameText, cc.xy(3, 1));

		Image image = null;
		try {
			image = ImageIO.read(new File("test2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ImageIcon icon = new ImageIcon(image);
		picture = new JLabel(icon);

		userPanel.add(picture, cc.xywh(5, 1, 1, 7));

		userPanel.add(species, cc.xy(1, 3));
		userPanel.add(speciesText, cc.xy(3, 3));

		userPanel.add(franchise, cc.xy(1, 5));
		userPanel.add(franchiseText, cc.xy(3, 5));

		userPanel.add(firstAppearance, cc.xy(1, 7));
		userPanel.add(appearanceText, cc.xy(3, 7));

		userPanel.add(owner, cc.xy(1, 9));
		userPanel.add(ownerText, cc.xy(3, 9));

		String[][] relations = { { "Faith", "Married", "Kingdom Hearts" }, { "Will", "Friend", "Kingdom Hearts" } };
		relationshipsTable = new JTable(relations, title);

		userPanel.add(relationships, cc.xy(1, 11));
		userPanel.add(relationshipsTable, cc.xywh(3, 11, 1, 5));

		userPanel.add(gender, cc.xywh(5, 9, 1, 2));
		userPanel.add(genderText, cc.xy(5, 11));
		userPanel.add(item, cc.xy(5, 13));
		userPanel.add(otherForms, cc.xy(5, 15));
		userPanel.add(picturegallery, cc.xy(5, 17));

		userPanel.add(description, cc.xy(1, 17));
		userPanel.add(descriptionText, cc.xy(3, 17));

		userPanel.add(edit, cc.xy(1, 19));
		userPanel.add(close, cc.xy(3, 19));
		userPanel.add(delete, cc.xy(5, 19));

		userPanel.setBorder(Borders.DLU4);

		characterPage.add(userPanel);
		characterPage.setSize(750, 500);
		characterPage.setVisible(true);
	}
}
