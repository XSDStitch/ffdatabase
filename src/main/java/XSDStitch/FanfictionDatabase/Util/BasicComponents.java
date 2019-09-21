package XSDStitch.FanfictionDatabase.Util;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasicComponents {
	public static JButton buttomSave() {
		return newButton("Save");
	}

	public static JTextField textfield() {
		return new JTextField(30);
	}

	public static JTextArea textarea() {
		return new JTextArea(5, 30);
	}

	public static JButton buttonClose() {
		return newButton("Close");
	}

	public static JButton buttonEdit() {
		return newButton("Edit");
	}

	public static JButton buttonNew() {
		return newButton("New");
	}

	public static JButton buttonDelete() {
		return newButton("Delete");
	}

	public static JButton buttonChoose() {
		return newButton("Choose");
	}
	
	private static JButton newButton(String text) {
		return new JButton(text);
	}
}
