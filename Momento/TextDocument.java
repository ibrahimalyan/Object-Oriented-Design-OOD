package Tar_Bait4_Question2_Solution;

public class TextDocument {

	private String text = "";
	private Momento momento = new Momento(text);

	public void write(String text) {
		this.text += text;
	}

	public void print() {
		System.out.println(text);
	}

	public void save() {
		momento.setLastState(text);
	}

	public void undo() {
		text = momento.getLastState();
	}

	public void redo() {
		text = momento.getNextState() ;
	}
}
