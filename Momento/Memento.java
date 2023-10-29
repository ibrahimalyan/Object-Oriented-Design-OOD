package Ex4Q2;

import java.util.ArrayList;

public class Memento {

	private ArrayList<String> states;//array that holds the states
	private int ptr;//pointer to the index of the current state.

	public Memento(String state) {//A constructor
		if (states == null)
		{
			states = new ArrayList<String>();
		}
		this.states.add(state);
		ptr = 0;
	}

	public String getLastState() {//for undo - get the last state of the document
		ptr = ptr - 1;
		if (ptr < 0)//the first state in the states array.
		{
			return states.get(0);
		}
		return states.get(ptr);
	}
	
	public String getNextState() {// for redo - get the next state after we did undo.
		ptr = ptr + 1;
		if (ptr >= 5 )//the last state in the states array.
		{
			return states.get(states.size() - 1);
		}
		return states.get(ptr);
	}

	public void setLastState(String state) {//add state to the arraylist
		if (ptr < states.size() - 1)
		{
			for (int i = states.size() - 1 ; i > ptr ; i ++ )
			{
				states.remove(i);
			}
		}
		if (states.size() == 5)
		{
			states.remove(0);
			
		}
		else
		{
			ptr = ptr + 1;
		}
		states.add(state);
	}
	
}
