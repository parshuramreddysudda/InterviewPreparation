import java.util.*;
public class CollectCards {
	
	public TreeMap<String, ArrayList<Integer> > card;
	public static int number;
	public static String symbol;
	
	public CollectCards() {
		this.card = new TreeMap<String, ArrayList<Integer>>();
	}
	
	public void addCard(String symbol, int number) {
		
		if(card.containsKey(symbol)) {
			card.get(symbol).add(number);
		}
		else {
			card.put(symbol, new ArrayList<Integer>());
			card.get(symbol).add(number);
		}
	}
	
	public void display() {
		int counter = 0;
		System.out.println("Distinct symbols are: ");
		Set set = card.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + "    ");
		}
		System.out.println();
		i = set.iterator();
		while(i.hasNext()) {
			counter = 0;
			Map.Entry me = (Map.Entry) i.next();
			System.out.println("Cards in " + me.getKey()+ " symbol");
			ArrayList<Integer> value = (ArrayList<Integer>) me.getValue();
			for(int x : value) {
				System.out.println(me.getKey() + "  " + x);
				counter++;
			}
			System.out.println("Number of cards: "+ counter  );
			
			int sum = 0;
			for(int x : value) {
				sum += x;
			}
			System.out.println("Sum of numbers: " + sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CollectCards obj = new CollectCards();
		System.out.println("Enter number of cards: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; ++i) {
			System.out.println("Enter Card " + i + ":");
			symbol = sc.nextLine();
			number = sc.nextInt();
			sc.nextLine();
			obj.addCard(symbol, number);
		}
		obj.display();
	}

}
