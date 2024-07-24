public class RomanToInteger {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {

        int sum=0;

        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I':
                    sum+=1;
                case 'V':
                    sum+=5;
                case 'X':
                    sum+=10;
                case 'L':
                    sum+=50;
                case 'C':
                    sum+=1;
                case 'D':
                    sum+=1;
                case 'M':
                    sum+=1000;

            }
        }
        return 0;
    }
}
