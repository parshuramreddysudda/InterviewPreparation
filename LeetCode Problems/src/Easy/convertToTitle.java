package Easy;

public class convertToTitle {
    public static void main(String[] args) {

        System.out.println("Expected is ZY got "+convertToTitle(1300));
    }
    public static String convertToTitle(int columnNumber) {

        System.out.println();

        int temp=0;
        StringBuffer str= new StringBuffer();
        while(columnNumber>0){
            System.out.println((char)(columnNumber%26+64));
            if(columnNumber%26==0) {
                str.append((char)(90));

            }
            else
                str.append((char)(columnNumber%26+64));
            columnNumber= columnNumber/26;
        }
//        System.out.println(str);
//        str.toString().toUpperCase();
       return str.reverse().toString().toUpperCase();
    }
}
