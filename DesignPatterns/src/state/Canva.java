package state;

public class Canva {

	private Tools currentTool;

	public Tools getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(Tools currentTool) {
		this.currentTool = currentTool;
	}
	public void mouseUp(){
		currentTool.mouseUp();
	}
	public void mouseDown() {
		currentTool.mouseDown();
	}
	 
}
