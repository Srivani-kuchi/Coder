package LC;

import java.util.Arrays;

public class reverse {
    public static void main (String[] args) {
        int[] array = {1, 4, 5, 6, 7};

        System.out.println("array before reverse: " + Arrays.toString(array) );

        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("array after reverse: " + Arrays.toString(array) );
    }
}

