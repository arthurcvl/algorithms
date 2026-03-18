package TwoPointers;

class ReverseWord {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int x = 0, y = 0, space;
        char temp;
        boolean eow = false;
        while(!eow){
            while(sb.charAt(y) != ' '){
                y++;
                if(y == sb.length()){
                    eow = true;
                    break;
                }
            }
            space = y + 1;
            y--;
            while(y > x){
                temp = sb.charAt(y);
                sb.setCharAt(y, sb.charAt(x));
                sb.setCharAt(x, temp);
                y--;
                x++;
            }
            x = space;
            y = space;
        }
        return sb.toString();
    }
}