package hashmap;

public class GenericHashMap {
    public static void main(String[] args) {
        HashMap hash=new HashMap();
        hash.put(1,"c");
        hash.put(2,"acsvb");
        hash.put(3,"vryj");
        hash.put(4,"cererg");
        hash.put(5,"umnhg");
        hash.put(6,"werfg");
        hash.put(7,"uhg");
        hash.put(8,"wefv");
        hash.put(9,"7yhgb");
        hash.put(10,"Old Value");
        hash.put(10,"New Value");
        System.out.println("Value is"+hash.get(1));
        hash.remove(1);
        System.out.println("Value is"+hash.get(1));
        hash.print();



    }
}
