//package linkedlist;
//
//public class LinkedList {
//
//	private class Node {
//
//		private int value;
//		private Node next;
//
//		public Node(int value) {
//			this.value = value;
//		}
//	}
//
//	private static Node first;
//	private static Node last;
//	private static int size = 0;
//
//	public void addLast(int item) {
//
//		var node = new Node(item);
//
//		if (first == null)
//			first = last = node;
//		else {
//			last.next = node;
//			last = node;
//		}
//		size++;
//	}
//
//
//	public int kthNodeFromEnd(int k) {
//
//		if(k>size || k<0)
//			return -1;
//
//		var node1=first;
//		var node2=first;
//		int length=k;
//		while(length-->=0)
//			node2=node2.next;
//
//		while(node2!=null) {
//			node1=node1.next;
//			node2=node2.next;
//		}
//		return node1.value;
//
//	}
//
//	public int[] toArray() {
//		int[] arr = new int[size];
//		var node = first;
//		int i = 0;
//		while (node != null) {
//			arr[i++] = node.value;
//			node = node.next;
//		}
//		return arr;
//	}
//
//	public void reverse() {
//
//		var current= first.next;
//		var previous=first;
//		while(current!=null) {
//			var next=current.next;
//			current.next=previous;
//			previous=current;
//			current=next;
//		}
//		last=first;
//		last.next=null;
//		first=previous;
//
////
////		int[] arr = toArray();
////		var node = first;
////		int index = arr.length-1;
////		while (node != null) {
////			node.value = arr[index--];
////			node = node.next;
////		}
//	}
//
//	public boolean isEmpty() {
//		return first == null;
//	}
//
//	public boolean contains(int index) {
//		return indexOf(index) != 1;
//	}
//
//	public int indexOf(int value) {
//		var node = first;
//		int i = 0;
//		while (node != null) {
//			if (node.value == value)
//				return i;
//			i++;
//			node = node.next;
//		}
//		return -1;
//	}
//
//	public int size() {
//
//		return size;
//	}
//
//	public void addFirst(int item) {
//
//		var node = new Node(item);
//
//		if (first == null)
//			first = last = node;
//		else {
//			node.next = first;
//			first = node;
//		}
//		size++;
//	}
//
//	public void delteFirst() {
//
//		if (first == null)
//			first = last = null;
//		else
//			first = first.next;
//
//		size--;
//
//	}
//
//	public void deleteLast() {
//
//		var prev = getPrevious(last);
//		if (prev == null) {
//			first = last = null;
//			return;
//		}
//		last = prev;
//		last.next = null;
//
//		size--;
//	}
//
//	private Node getPrevious(Node node) {
//		var current = first;
//		while (current != null) {
//			if (current.next == node)
//				return current;
//			current = current.next;
//		}
//		return null;
//	}
//
//	public void print() {
//		var root = first;
//		while (root != null) {
//			System.out.println(root.value);
//			root = root.next;
//		}
//	}
//
//}
