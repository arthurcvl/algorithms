package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] array, int n){

        int l = 0, r = array.length - 1;

        while(l < r){
            int m = l + (r - l) / 2;

            if(n > m){
                l = m + 1;
            } else if(n < m){
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("zz " + binarySearch(new int[]{1, 2, 3, 4}, 10));
    }

}
