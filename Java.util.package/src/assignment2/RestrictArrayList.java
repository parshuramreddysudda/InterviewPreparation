package assignment2;

import java.util.ArrayList;
import java.util.List;


class MyArrayList<E> extends ArrayList<E>{
	
	public boolean add(E e) {
		if((e instanceof Integer || e instanceof Float || e instanceof Double)){
			super.add(e);
			return true;
		}
		else {
			throw new ClassCastException("Must be Integer, Float, and Double . ");
		}
	}
}


public class RestrictArrayList {

	public static void main(String[] args) {

		List<Object> list=new MyArrayList();
		try {
			list.add(56.78);
			list.add(5678);
			list.add(0.5678);
			list.add("asdsad");
			System.out.println("Added");
		} catch (Exception e) {
			 System.out.println(e);
		}
		

	}

}
