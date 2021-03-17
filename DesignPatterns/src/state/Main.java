package state;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Canva can=new Canva();
		can.setCurrentTool(new SelectionTool());
		can.getCurrentTool().mouseUp();
		can.getCurrentTool().mouseDown();
		
	}

}
