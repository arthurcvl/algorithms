package Bitwise.XOR;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            s ^= nums[i];
        }
        for(int i = 0; i <= nums.length; i++){
            s ^= i;
        }
        return s;
    }
}
