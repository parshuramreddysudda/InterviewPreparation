package hashmap;

import java.util.LinkedList;

public class HashMap {
    public class Entry {
        public  int key;
        public String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Entry>[] array = new LinkedList[5];
    int size = array.length;


    private int getHashValue(int key) {
        return key % size;
    }

    public String get(int key) {
//        array[0].add(new Entry(10,"asd"));

        int hash = getHashValue(key);
        LinkedList<Entry> list = array[hash];

        for (Entry element : list) {
            if (element.key == key) {
                return element.value;
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
        for( Entry entry:bucket){
            if(entry.key==key){
                entry.value=value;
                return;
            }
        }
        bucket.addLast(new Entry(key, value));

        System.out.println("Element Inserted into " + index + " Level, Key is " + key + " Value is" + value + " List size is "+bucket.size());
//        print();
    }

    public void print() {

        for (int i = 0; i < size; i++) {
            LinkedList<Entry> bucket=array[i];
            if(bucket!=null)
            for (Entry element :bucket) {
                System.out.println("Key is" + element.key + " Value is " + element.value);
            }
        }
    }

    public boolean remove(int key) {
        int hash = getHashValue(key);
        LinkedList<Entry> list = array[hash];

        for (Entry element : list) {
            if (element.key == key) {
                list.remove(element);
                return true;
            }
        }
        return false;
    }
}
