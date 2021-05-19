package assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Products {

	static List<Item> itemList = new ArrayList<Item>();
	static int globalID=1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1: Add new Product");
			System.out.println("2: Display Products");
			System.out.println("3: Calculate Cost of all Products");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				addItem();
				break;
			case 2:
				printProducts();
			case 3:
				printCost();
			default:
				break;
			}
		}

	}

	private static void addItem() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name of product");
		String name = sc.next();

		System.out.println("Enter Cost of product");
		int cost = sc.nextInt();

		System.out.println("Enter Availablity of product");
		int available = sc.nextInt();
		itemList.add(new Item(globalID++, name, cost, available));
	}

	private static void printCost() {
		int cost = 0;
		Iterator<Item> it = itemList.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			cost += item.getCost();
		}
		System.out.println("Total Cost = " + cost);
	}

	private static void printProducts() {
		Iterator<Item> it = itemList.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println(item.toString());
		}
	}

}
