package XSDStitch.FanfictionDatabase.GUI;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.GUI.Frame.ListFrames;

public class PictureList extends ListFrames {
	private String rows = "pref:grow";
	private String col = "pref:grow";

	public PictureList() {
		layout = new FormLayout(col, rows);
		builder = new PanelBuilder(layout);
		builder.add(setSingleList(), cc.xy(1, 1));

		setFrame("Pictures");
	}
}
