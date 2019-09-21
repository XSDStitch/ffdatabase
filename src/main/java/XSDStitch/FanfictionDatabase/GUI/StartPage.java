package XSDStitch.FanfictionDatabase.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import XSDStitch.FanfictionDatabase.Util.BasicComponents;

public class StartPage {

	private JTextField searchField = BasicComponents.textfield();

	private String columnsetting = "pref:grow, 3dlu, pref:grow, 3dlu, min:grow, 3dlu, min:grow";
	private String rowSetting = "pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow, 3dlu, pref:grow";
	
	private JButton search = new JButton("Search");
	private JButton pictures = new JButton("Pictures");
	private JButton characters = new JButton("Characters");
	private JButton stories = new JButton("Stories");
	private JButton items = new JButton("Items");
	private JButton franchise = new JButton("Franchise");
	private JButton contacts = new JButton("Contacts");
	
	private JMenuBar bar = new JMenuBar();
	private JMenu datei = new JMenu("File");
	private JMenu newObject = new JMenu("New");
	private JMenuItem close = new JMenuItem("Close");
	private JMenuItem newPicture = new JMenuItem("Picture");
	private JMenuItem newCharacter = new JMenuItem("Character");
	private JMenuItem newStory = new JMenuItem("Story");
	private JMenuItem newItem = new JMenuItem("Item");
	private JMenuItem newFranchise = new JMenuItem("Franchise");
	private JMenuItem newContact = new JMenuItem("Contact");
	private JMenuItem info = new JMenuItem("Info");

	private CellConstraints cc = new CellConstraints();
	private FormLayout layout = new FormLayout(columnsetting, rowSetting);
	private PanelBuilder startpagePanel = new PanelBuilder(layout);
	private JFrame startpageFrame = new JFrame("FanFiction Database");

	
	public StartPage() {
		
		
		startpagePanel.border(Borders.DLU14);

		setComponents();
		
		setStartMenu();
		
		setMenuBar();
		
		setFrame();

	}


	private void setFrame() {
		startpageFrame.setJMenuBar(bar);
		startpageFrame.add(startpagePanel.getPanel());
		startpageFrame.setSize(500, 250);
		startpageFrame.setVisible(true);
	}


	private void setComponents() {
		startpagePanel.add(searchField, cc.xyw(1, 1, 3));
		startpagePanel.add(search, cc.xy(5, 1));

		startpagePanel.addSeparator("Galleries", cc.xyw(1, 3, 7));

		startpagePanel.add(pictures, cc.xy(1, 5));
		startpagePanel.add(characters, cc.xy(3, 5));
		startpagePanel.add(stories, cc.xy(5, 5));
		startpagePanel.add(items, cc.xy(7, 5));

		startpagePanel.addSeparator("Lists", cc.xyw(1, 7, 7));

		startpagePanel.add(franchise, cc.xy(1, 9));
		startpagePanel.add(contacts, cc.xy(3, 9));
		
		datei.add(close);
	}


	private void setMenuBar() {
		bar.add(datei);
		bar.add(newObject);
		bar.add(info);
	}


	private void setStartMenu() {
		newObject.add(newPicture);
		newObject.add(newCharacter);
		newObject.add(newStory);
		newObject.add(newItem);
		newObject.add(newFranchise);
		newObject.add(newContact);
	}

}
