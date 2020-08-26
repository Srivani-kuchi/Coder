package LC;

public class insertionSort {

      /*  public static void Sort(int array[]) {
            int n = array.length;
            for (int j = 1; j < n; j++) {
                int key = array[j];
                int i = j-1;
                while ( (i > -1) && ( array [i] > key ) ) {
                    array [i+1] = array [i];
                    i = i - 1;
                }
                array[i+1] = key;
            }
        }*/

    public static void main(String args[]) {
      //  int nums[] = {1, 0, 0, 1, 1};
       // System.out.println(findMaxConsecutiveOnes(nums));

    }

           /* int[] arr1 = {9,14,3,2,43,11,58,22};
            System.out.println("Before Insertion Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
            System.out.println();

            Sort(arr1);//sorting array using insertion sort

            System.out.println("After Insertion Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
        }*/

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                count = 0;
            else
                count++;

            if(count > max){
                max = count;
            }
        }
        return max;
    }
}








