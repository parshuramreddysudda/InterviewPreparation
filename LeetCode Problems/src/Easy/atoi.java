package Easy;

public class atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("96754783456789dfdgfhnbvcxw3456"));
    }

    public static int myAtoi(String s) {

        int i = 0;
        int ans = -1;
        String result="";
        for(char c : s.toCharArray()) {
            if(c >= 48 && c <= 57){
                result+=c;
                ans+= Character.getNumericValue(c);
            }
            else
                break;
        }
        try{
            return Integer.parseInt(result);
        }
        catch (NumberFormatException ex){
            return Integer.MAX_VALUE;
        }

    }
}
