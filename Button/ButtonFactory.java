package Tar_Bait4_Question1_Solution;

//import java.util.HashMap;

import Tar_Bait4_Question1_Solution.Button.Color;

public class ButtonFactory {

	//private HashMap<Color, Button> buttons = new HashMap<>(); //The change of the code because of Q1.3
	private Button button;
	
	//create button when the color isn't exists.
	public Button getButton(Color color) 
	{
		//The change of the code because of Q1.3  - check if the Button exists in another color. 
		//Button button = buttons.get(color);
		if (button == null) 
		{
			button = new Button(color);
			//buttons.put(color, button);
		}
		return button;
	}

}
