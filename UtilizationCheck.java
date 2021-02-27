public class Solution {
    public int finalInstances(int instances, int[] averageUtil) {
        //int start = averageUtil[0];
        for(int i = 0; i < averageUtil.length; i++){
            if(averageUtil[i] < 25 && instances > 1){
                instances = (int)(Math.ceil(instances/2.0));
                i += 10;
            }
            if(i < averageUtil.length &&averageUtil[i] >= 25 && averageUtil[i] <= 60){
                continue;
            }
            if(i < averageUtil.length && averageUtil[i] > 60 && instances < 200000000){
                instances = instances*2;
                i = i + 10;
            }
        }
        return instances;
}
}
