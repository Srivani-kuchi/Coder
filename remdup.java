package LC;

public class remdup {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }
        public static int removeDuplicates ( int[] nums){

            int i = 0;
            int j = i + 1;
            while(j < nums.length){
                if(nums[i] == nums[j]){
                    j++;
                    System.out.println(j);
                }
                else{
                    i = i + 1;
                    nums[i] = nums[j];
                }
            }
            return i+1;
        }
    }

