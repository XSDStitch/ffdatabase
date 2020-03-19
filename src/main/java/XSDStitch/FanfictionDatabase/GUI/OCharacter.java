package XSDStitch.FanfictionDatabase.GUI;

import javax.swing.JButton;
import XSDStitch.FanfictionDatabase.Util.BasicComponents;
import XSDStitch.FanfictionDatabase.abstractClasses.AbstractCharacter;

public class OCharacter extends AbstractCharacter {

	private JButton item;
	private JButton otherForms;
	private JButton picturegallery;

	private JButton edit;
	private JButton close;
	private JButton delete;

	public OCharacter() {

		characterPage.setVisible(true);
	}

	@Override
	protected void setButtoms() {
		
		initButtoms();
		
		userPanel.add(item, cc.xy(5, 13));
		userPanel.add(otherForms, cc.xy(5, 15));
		userPanel.add(picturegallery, cc.xy(5, 17));
		userPanel.add(edit, cc.xy(1, 19));
		userPanel.add(close, cc.xy(3, 19));
		userPanel.add(delete, cc.xy(5, 19));
	}

	protected void initButtoms() {
		item = new JButton("Items");
		otherForms = new JButton("Other Forms");
		picturegallery = new JButton("Pictures");

		edit = BasicComponents.buttonEdit();
		close = BasicComponents.buttonClose();
		delete = BasicComponents.buttonDelete();

	}
}
