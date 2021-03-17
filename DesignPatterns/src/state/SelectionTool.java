package state;

public class SelectionTool implements Tools {

	@Override
	public void mouseUp() {
		System.out.println("Draw selected");

	}

	@Override
	public void mouseDown() {
		System.out.println("Drewa a dashed line");

	}

}
