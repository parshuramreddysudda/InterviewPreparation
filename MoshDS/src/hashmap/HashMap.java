package hashmap;

import java.util.LinkedList;

public class HashMap {

    LinkedList<Entry>[] array = new LinkedList[5];
    int size = array.length;

    public HashMap() {

        for (int i = 0; i < size; i++) {
            LinkedList<Entry> list = new LinkedList<Entry>();
            array[i] = list;
        }
    }

    private int getHashValue(int key) {
        return key % size;
    }

    public String get(int key) {
//        array[0].add(new Entry(10,"asd"));

        int hash = getHashValue(key);
        LinkedList<Entry> list = array[hash];

        for (Entry element : list) {
            if (element.getKey() == key) {
                return element.getValue();
//                list.remove(element);
            }
        }

        return "-1";
    }

    public void put(int key, String value) {


        int index = getHashValue(key);
        if (array[index] == null)
            array[index] = new LinkedList<>();

        LinkedList<Entry> bucket=array[index];
        for( Entry entry:array[index]){
            if(entry.getKey()==key){
                entry.setValue(value);
                return;
            }
        }
        bucket.addLast(new Entry(key, value));

        System.out.println("Element Inserted into " + index + " Level, Key is " + key + " Value is" + value + " List size is "+bucket.size());
//        print();
    }

    public void print() {

        for (int i = 0; i < size; i++) {
//            ArrayList<Entry> list=array[i];
//            System.out.println("List Size is"+list.size());
            for (Entry element : array[i]) {
                System.out.println("Key is" + element.getKey() + " Value is " + element.getValue());
            }
        }
    }

    public boolean remove(int key) {
        int hash = getHashValue(key);
        LinkedList<Entry> list = array[hash];

        for (Entry element : list) {
            if (element.getKey() == key) {
                list.remove(element);
                return true;
            }
        }
        return false;
    }
}
