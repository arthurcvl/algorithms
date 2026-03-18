package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        int r = 1, l;

        int max = 1;

        if(a.length == 0) return 0;

        while(r != a.length){
            Set<Character> actualChars = new HashSet<>();
            actualChars.add(a[r]);
            l = r - 1;
            while(l != -1){
                if(actualChars.contains(a[l])) break;
                actualChars.add(a[l]);
                if(r - l + 1 > max) max = r - l + 1;
                l--;
            }
            r++;
        }

        return max;
    }

}
