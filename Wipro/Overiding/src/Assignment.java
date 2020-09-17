/**
 Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment {

	/**
	 * 
	 */
	public Assignment() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Fruit().eat();
		new Apple().eat();
		new Orange().eat();

	}
	public static class Fruit {
		protected String taste;
		protected int size;
		private String name;
		
		public Fruit() {
			name = "Fruit name";
			taste = "Tase of the fruit";
			size = 0;
		}
		
		public void eat () {
			System.out.println(name + " tastes like " + taste);
		}
	}
	
	public static class Apple extends Fruit {
		@Override
		public void eat() {
			System.out.println("It tastes like apple");
		}
	}
	public static class Orange extends Fruit {
		@Override
		public void eat() {
			System.out.println("It tastes like Orange");
		}
	}

}
