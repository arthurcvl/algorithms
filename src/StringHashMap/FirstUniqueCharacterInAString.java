package StringHashMap;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {


    public int firstUniqChar(String s) {
        //return index
        HashMap<Character, int[]> hashMap = new HashMap<>();
        char[] a = s.toCharArray();

        int r = 0;

        while(r != a.length){
            hashMap.merge(a[r], new int[]{r, 1}, (oldValue, newValue) ->{
                return new int[]{oldValue[0], oldValue[1] + 1};
            });
            r++;
        }
        int ex = -1;
        for(int i = a.length - 1; i >= 0; i--){
            if(hashMap.get(a[i])[1] == 1) ex = hashMap.get(a[i])[0];
        }
        return ex;
    }


}
