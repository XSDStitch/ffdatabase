package XSDStitch.FanfictionDatabase;

import XSDStitch.FanfictionDatabase.GUI.Franchise;
import XSDStitch.FanfictionDatabase.GUI.FranchiseSortedList;
import XSDStitch.FanfictionDatabase.GUI.OCharacter;
import XSDStitch.FanfictionDatabase.GUI.Person;
import XSDStitch.FanfictionDatabase.GUI.Picture;
import XSDStitch.FanfictionDatabase.GUI.PictureList;
import XSDStitch.FanfictionDatabase.GUI.SingleItem;
import XSDStitch.FanfictionDatabase.GUI.StartPage;
import XSDStitch.FanfictionDatabase.GUI.StoryIdeas;
import XSDStitch.FanfictionDatabase.GUI.addnew.AddChapter;
import XSDStitch.FanfictionDatabase.GUI.addnew.AddCharacterToStory;
import XSDStitch.FanfictionDatabase.GUI.addnew.NewEditStoryIdea;
import XSDStitch.FanfictionDatabase.GUI.addnew.NewFranchise;
import XSDStitch.FanfictionDatabase.GUI.addnew.incomplete.StoryFrame;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		new AddChapter();
		new AddCharacterToStory();
		new FranchiseSortedList("Character List");
		new FranchiseSortedList("Story List");
		new OCharacter();
		new Franchise();
		new StartPage();
		new StoryIdeas();
		new NewEditStoryIdea();
		new StoryIdeas();
		new NewFranchise();
		new SingleItem();
		new PictureList();
		new Person();
		new Picture();
		new StoryFrame();
	}
}
