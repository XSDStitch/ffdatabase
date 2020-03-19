package XSDStitch.FanfictionDatabase.GUI.addnew;

import javax.swing.JButton;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;
import XSDStitch.FanfictionDatabase.abstractClasses.AbstractCharacter;

public class NewCharacter extends AbstractCharacter {

	private JButton save;
	private JButton close;
	private JButton addRelationship;
	private JButton choosePicture;
	private JButton addForm;
	private JButton addItem;
	
	public NewCharacter() {
		characterPage.setVisible(true);
	}

	@Override
	protected void initButtoms() {
		save = BasicComponents.buttomSave();
		close = BasicComponents.buttonClose();
		addRelationship = new JButton("Add Relationship");
		choosePicture = BasicComponents.buttonChoose();
		addForm = new JButton("Add Form");
		addItem = new JButton("Add Item");

	}

	@Override
	protected void setButtoms() {
		initButtoms();

		userPanel.add(choosePicture, cc.xy(5, 13));
		userPanel.add(addForm, cc.xy(5, 15));
		userPanel.add(addItem, cc.xy(5, 17));
		userPanel.add(save, cc.xy(1, 19));
		userPanel.add(close, cc.xy(3, 19));
		userPanel.add(addRelationship, cc.xy(5, 19));

	}

}
