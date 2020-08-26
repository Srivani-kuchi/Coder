package LC;

public class sortedSquares {

    public static void main(String[] args){
        int[] A = {-6,-4,1,2,5};
        int[] result = sortedSquares(A);
        printArray(result);

    }
    public static int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length-1;
        int[] sorted_array = new int[A.length];
        for(int i = A.length-1; i >= 0; i--){
            if(Math.abs(A[left]) > A[right] ){
                sorted_array[i] = A[left]* A[left];
                left++;
            }
            else{
                sorted_array[i] = A[right]* A[right];
                right--;
            }

        }
        return sorted_array;

    }

    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
