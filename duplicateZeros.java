package LC;

import java.util.Arrays;

public class duplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        //duplicateZeros(arr);
        for(int i: duplicateZeros(arr)){
            System.out.println(i);
        }

    }

    public static int[]  duplicateZeros(int[] arr) {
        int zeroes = 0;
        for (int i : arr) {
            if (i == 0) {
                zeroes++; // count number of zeroes
            }
        }
        int i = arr.length - 1; //p1
        System.out.println(i);
        int j = arr.length + zeroes - 1; //p2 extended array
        System.out.println(j);
        while (i != j) {
            insert(arr, i, j--);
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            i--;
        }
        return arr;
    }

    public static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
}
