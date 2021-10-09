package arrays;

import java.util.Iterator;

public class Arrays {

	static int[] items;
	static int count = 0;

	public Arrays(int count) {
		items = new int[count];
	}

	public int removeAt(int index) {
		if (index > count)
			return -1;
		int[] tempArray = new int[count - 1];
		for (int i = 0, j = 0; i < count; i++) { 
			if (i != index)
				tempArray[j++] = items[i];
		}
		count--;
		items = tempArray;
		print();
		return 0;
	}

	public void insert(int number) {
		if (count == items.length) {
			int[] newarray = new int[count * 2];
			for (int i = 0; i < items.length; i++) {
				newarray[i] = items[i];
			}
			items = newarray;
		}
		items[count++] = number;
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(items[i]);
	}
}
