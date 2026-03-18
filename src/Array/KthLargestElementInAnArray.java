package Array;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return dnf(nums, k, 0, nums.length - 1);
    }

    public static int dnf(int[] nums, int k, int l, int r){
        int temp;
        int m = l;
        int al = l;
        int ar = r;
        int pivot = nums[r];

        while(m <= ar){
            if(nums[m] < pivot){
                temp = nums[m];
                nums[m] = nums[al];
                nums[al] = temp;
                m++;
                al++;
            } else if(nums[m] > pivot){
                temp = nums[m];
                nums[m] = nums[ar];
                nums[ar] = temp;
                ar--;
            }else{
                m++;
            }
        }

        if (nums.length - k >= al && nums.length - k < m) return nums[al];
        if(nums.length - k < m) return dnf(nums, k, l, al - 1);
        return dnf(nums, k, m, r);
    }
}
