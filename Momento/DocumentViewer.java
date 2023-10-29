package Tar_Bait4_Question2_Solution;

public class DocumentViewer {

	private static TextDocument textDocument = new TextDocument();

	public static void main(String[] args) {
		String s = "Hello This is the 4th exercise in Obejct Oriented Design Course.";
		String[] toWrite = s.split(" ");
		for (int i = 0 ; i < toWrite.length ; i ++)
		{
			textDocument.write(toWrite[i] + " ");
			textDocument.save();
			textDocument.print();
		}

		textDocument.undo();
		textDocument.print();
		textDocument.undo();
		textDocument.print();
		textDocument.undo();
		textDocument.print();
		textDocument.redo();
		textDocument.print();
		textDocument.redo();
		textDocument.print();
	}
}
