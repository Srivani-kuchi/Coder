package LC;

import java.util.Arrays;

public class mergeArray {

    public static void main(String args[]) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int n = 3;
        int[] nums2 = {2,5,6};
        System.out.println(merge(nums1, 3, nums2, 3));
    }

        public static int[] merge ( int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int current = m + n - 1;
            while (nums1[i] >= 0 && nums2[j] >= 0) {
                if (nums1[i] >= nums2[j]) {
                    nums1[current--] = nums1[i--];
                }
                nums1[current--] = nums2[j--];
            }
            while (j >= 0) {
                nums1[current--] = nums2[j--];
            }
            return nums1;
        }

            }

