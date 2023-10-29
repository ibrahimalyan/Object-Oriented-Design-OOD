package Tar_Bait4_Question1_Solution;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import Tar_Bait4_Question1_Solution.Button.Color;


public class UIOfGame {

	static ArrayList<Button> buttons = new ArrayList();
	static ButtonFactory buttonFactory = new ButtonFactory();

	public static void main(String[] args) {

		Runnable createNewButtons = new Runnable() //create buttons have different colors.
		{
			public void run() 
			{
				createButtons();
			}
		};
		
		Runnable changeButtonLocation = new Runnable() //change the data of location's field.
		{
			public void run() 
			{
				changeLocation(buttons.get(0));
				changeLocation(buttons.get(1));
				changeLocation(buttons.get(2));
			}
		};

		Runnable removeButtons = new Runnable() {//remove buttons
			public void run() {
				removeButton();
			}
		};

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(createNewButtons, 0, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(changeButtonLocation, 3, 5, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(removeButtons, 5, 8, TimeUnit.SECONDS);
	}
	
	private static void createButtons()
	{
		Button button_b = buttonFactory.getButton(Color.BLUE);
		Button button_g = buttonFactory.getButton(Color.GREEN);
		Button button_y = buttonFactory.getButton(Color.YELLOW);
		buttons.add(button_b);
		buttons.add(button_g);
		buttons.add(button_y);
		button_b.displayButton();
		button_g.displayButton();
		button_y.displayButton();

	}
	
	private static void removeButton() 
	{
		System.out.println("Removing " + buttons.get(0));
		buttons.remove(0);
	}

	private static void changeLocation(Button b)//set a random location
	{
		Random random = new Random();
		b.setLocation(random.nextInt(100), random.nextInt(100));
		System.out.println("Button " + b + ", color: " + b.getColor() +
				", location: " + b.getLocation()[0] + " " + b.getLocation()[1]);
	}
}
