package SlidingWindow;

import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurrences {

    public static int solution(String s){

        char[] sb = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int l = 0, r = 0, max = 1;

        while(r != sb.length){
            hashMap.merge(sb[r], 1, Integer::sum);
            while(hashMap.get(sb[r]) == 3){
                hashMap.put(sb[l], hashMap.get(sb[l]) - 1);
                l++;
            }
            if(r - l + 1> max) max = r - l + 1;
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution("eebadadbfa"));
    }

}
