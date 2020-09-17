/**
 * 
 */

/**
 * @author parsh
 *
 */

public class Assignment2 {

	public static void main(String[] args) {
		Compartment compartment = new Compartment(10.5, 4.5, 8.2);
		
		System.out.println(compartment);
	}
	
	public static class Compartment {
		private double height;
		private double width;
		private double breadth;
		
		public Compartment(double height, double width, double breadth) {
			super();
			this.height = height;
			this.width = width;
			this.breadth = breadth;
		}

		@Override
		public String toString() {
			return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
		}

		
	}

}