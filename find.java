package LC;

public class find {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(nums.length);
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;

            }

            if (target != nums[i]) {
                if ((nums.length == 1) && (nums[i] < target)) {
                    return i + 1;
                }
                if (nums.length > 1) {
                    i++;
                    if(target < nums[i]){
                        return i;
                    }


                    if (target > nums[nums.length - i]) {
                        return nums.length - i + 1;
                    }
                }
            }
        }
        return 0;
    }
}

