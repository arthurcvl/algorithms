package PureSorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int s, f, temp;
        int lr = array.length - 1;
        boolean isSorted;

        while(lr != 0){
            isSorted = true;
            s = 0;
            f = 1;
            while(s != lr){
                if(array[s] > array[f]){
                 temp = array[s];
                 array[s] = array[f];
                 array[f] = temp;
                 isSorted = false;
                }
                s++;
                f++;
            }
            if(isSorted) return;
            lr--;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}