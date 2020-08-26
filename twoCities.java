package LC;

import java.util.Arrays;

public class twoCities {

    public static void main(String args[]) {
        int[][] costs = new int[][]{{1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3}};
        System.out.println(twoCitySchedCost(costs));
    }


        public static int twoCitySchedCost(int[][] costs){
            Arrays.sort(costs, (a, b) -> {
                return (a[0] - a[1]) - (b[0] - b[1]); // comparator class
            });

            int cost = 0; // intial cost
            for (int i = 0; i < costs.length / 2; i++) { // for citi A (dividing the array into 2 parts
                cost = cost + costs[i][0];
            }
            for (int i = costs.length / 2; i < costs.length; i++) {
                cost = cost + costs[i][1]; // for B
            }
            return cost;
        }
    }

