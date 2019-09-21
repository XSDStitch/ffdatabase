package XSDStitch.FanfictionDatabase.GUI;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.GUI.Frame.ListFrames;

public class FranchiseSortedList extends ListFrames {
	private String rows = "pref:grow, 3dlu, pref:grow, 3dlu ,pref:grow, 3dlu, pref:grow";
	private String col = "pref:grow";
	public FranchiseSortedList(String type) {
		layout = new FormLayout(col, rows);
		builder = new PanelBuilder(layout);
		builder.addSeparator("Franchise A", cc.xy(1, 1));
		builder.add(setSingleList(), cc.xy(1, 3));
		builder.addSeparator("Franchise B", cc.xy(1, 5));
		builder.add(setSingleList(), cc.xy(1, 7));

		setFrame(type);

	}

}