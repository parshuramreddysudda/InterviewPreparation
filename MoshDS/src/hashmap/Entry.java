package hashmap;

public class Entry {
    public static int key;
    public static String value;

    public Entry(int key,String value) {
        this.key=key;
        this.value=value;
    }

    public  int getKey() {
        return key;
    }

    public  void setKey(int key) {
        Entry.key = key;
    }

    public  String getValue() {
        return value;
    }

    public void setValue(String value) {
        Entry.value = value;
    }
}
