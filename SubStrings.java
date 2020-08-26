package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStrings {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

    }


        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> outputList = new ArrayList<>();
            // since empty array is also a subset, return empty array
            if (nums.length == 0 || nums == null)
                return outputList;

            Arrays.sort(nums);

            List<Integer> subsetList = new ArrayList<>();
            subsetsOfArray(nums, outputList, subsetList, 0);
            return outputList;

        }



        public void subsetsOfArray(int[]nums,List<List<Integer>> outputList, List<Integer> subsetList, int index){
            outputList.add(new ArrayList<>(subsetList));
            for (int i = index; i < nums.length; i++) {
                subsetList.add(nums[i]);
                subsetsOfArray(nums, outputList, subsetList, i + 1);
                subsetList.remove(subsetList.size() - 1);
               // System.out.println(outputList);


            }




    }
}
