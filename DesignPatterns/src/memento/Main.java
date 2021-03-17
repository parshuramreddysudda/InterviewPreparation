package memento;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Editor edit=new Editor();
		History hist = new History();
		edit.setContent("First Thing ");
		hist.push(edit.createState());
		edit.setContent("Second Thing ");
//		hist.push(edit.createState());
		edit.restoreState(hist.pop());
		System.out.println(edit.getContent());
		 

	}

}
