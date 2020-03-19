package XSDStitch.FanfictionDatabase.abstractClasses;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.TestPics;
import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public abstract class AbstractCharacter {

	private static final String COLUMNSETTING = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	private static final String ROWSETTING = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	protected JLabel name = new JLabel("Name");
	protected JTextField nameText = BasicComponents.textfield();
	protected JLabel species = new JLabel("Species");
	protected JTextField speciesText = BasicComponents.textfield();
	protected JLabel franchise = new JLabel("Franchise");
	protected JComboBox<String> franchiseText = new JComboBox<String>(getFranchiseList());
	protected JLabel firstAppearance = new JLabel("First Appearance");
	protected JTextField appearanceText = BasicComponents.textfield();
	protected JLabel owner = new JLabel("Owner");
	protected JTextField ownerText = BasicComponents.textfield();
	protected JLabel relationships = new JLabel("Relationships");
	protected JTable relationshipsTable;
	protected JLabel description = new JLabel("Descripion");
	protected JTextArea descriptionText = BasicComponents.textarea();
	protected JLabel picture;
	protected JLabel gender = new JLabel("Gender");
	protected JComboBox<String> genderText = genderbox();
	protected JFrame characterPage = new JFrame("Character");

	private FormLayout layout = new FormLayout(COLUMNSETTING, ROWSETTING);
	protected CellConstraints cc = new CellConstraints();
	protected JPanel userPanel = new JPanel(layout);

	protected String[] title = { "Name", "Type", "Story" };

	public AbstractCharacter() {
		super();
		userPanel.add(name, cc.xy(1, 1));
		userPanel.add(nameText, cc.xy(3, 1));

		ImageIcon icon = setPicture();
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

		userPanel.add(description, cc.xy(1, 17));
		userPanel.add(descriptionText, cc.xy(3, 17));

		setButtoms();

		userPanel.setBorder(Borders.DLU4);

		characterPage.add(userPanel);
		characterPage.setSize(750, 500);
	}

	private ImageIcon setPicture() {
		return TestPics.getPic();
	}

	private String[] getFranchiseList() {
		String[] franchise = { "Pokemon", "Digimon", "Megaman" };
		return franchise;
	}

	private JComboBox<String> genderbox() {
		String[] gender = { "", "Female", "Male", "Herm", "Other" };
		JComboBox<String> box = new JComboBox<String>(gender);
		return box;
	}

	protected abstract void initButtoms();

	protected abstract void setButtoms();

}