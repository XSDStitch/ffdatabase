package XSDStitch.FanfictionDatabase.GUI.addnew.incomplete;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.TestPics;
import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class NewItem {

	private JLabel name = new JLabel("Name");
	private JTextField nameField = BasicComponents.textfield();
	
	private JLabel user = new JLabel("User");
	private JComboBox<String> userBox = new JComboBox<String>(getBox());
	
	private JLabel discription = new JLabel("Discription");
	private JTextArea discriptionArea = BasicComponents.textarea();
	
	private JButton save = BasicComponents.buttomSave();
	
	private JLabel picture = new JLabel(TestPics.getPic());
	private JButton chooseFile = BasicComponents.buttonChoose();
	
	private static final String COLUMNSETTING = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	private static final String ROWSETTING = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";

	private FormLayout layout = new FormLayout(COLUMNSETTING, ROWSETTING);
	protected CellConstraints cc = new CellConstraints();
	protected JPanel userPanel = new JPanel(layout);
	
	private  JFrame newItem = new JFrame("New Item");
	
	public NewItem() {

		userPanel.add(name, cc.xy(1, 1));
		userPanel.add(nameField, cc.xy(3, 1));
		
		userPanel.add(user, cc.xy(1, 3));
		userPanel.add(userBox, cc.xy(3, 3));
		
		userPanel.setBorder(Borders.DLU4);

		newItem.add(userPanel);
		newItem.setSize(750, 500);
	}
	
	private String[] getBox() {
		String[] names = {"Kuran","Will","Hanna"};
		return names;
	}
}
