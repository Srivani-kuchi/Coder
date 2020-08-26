package LC;

import java.util.Scanner;

public class minimumElement {


    public static void main(String args[]) {
       int[] input = new int[]{12, 3, 5, 6, 7};

       /* for(int i=0; i<input.length; i++) {
            System.out.println(input[i]);
        }*/

       System.out.println("min value = " + findMin(input));


    }

    private static int findMin(int[] array) {


        //int temp = 0;
        int min = array[0]; // 6
        int secondmin = array[0];
        for (int i = 0; i < array.length; i++) { // 6 2 5 4
            if (array[i] < min) {  //2 < 6
                secondmin = min;  // sm = 6
                min = array[i];  // m = 2
                // secondmin = min;

            } else if ((array[i] < secondmin)) {
                secondmin = array[i];  //
            }
        }

        System.out.println("minimim is " + min);

        System.out.println("second min is " + secondmin);

        return min;




    }




    }
