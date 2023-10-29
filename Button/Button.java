package Tar_Bait4_Question1_Solution;
import java.util.Random;

public class Button {
	public enum Color {
		YELLOW,
		GREEN,
		BLUE
	}
	private Color color;
	private int[] location = new int[2];

	public Button(Color color) //A constructor
	{
		this.color = color;
		location[0] = 0;
		location[1] = 0;
	}

	public Color getColor()
	{
		return color;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public int[] getLocation()
	{
		return location;
	}

	public void setLocation(int latitude, int longitude) //generate a specific location
	{
		location[0] = latitude;
		location[1] = longitude;
	}

	public void displayButton()//display the button and its details
	{
		if (this.color == Color.BLUE)
		{
			System.out.println(String.format("The blue button located in %d/%d", location[0], location[1]));
		}
		else if (this.color == Color.GREEN)
		{
			System.out.println(String.format("The green button located in %d/%d", location[0], location[1]));
		}
		else
		{
			System.out.println(String.format("The yellow button located in %d/%d", location[0], location[1]));
		}
	}

	public void randomColor() //function to generate a random color
	{
		Random rand = new Random();
		Color[] values = Color.values();
		int index = rand.nextInt(values.length);
		this.color =  values[index];
	}
	
}
