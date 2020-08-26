package LC;

public class evenNumbers {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 1234};
        System.out.println(findNumbers(nums));
    }


    public static int findNumbers(int[] nums) {
        int r = 0;
        int count = 0;
        int q = 0;
        while(count >= 0){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count = count + 1; // count = 1 => 12
            }
        }

            int last = count;
            return last;
        }
        return 0;
    }
}




