/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintIndexToSum;

/**
 * prints indices that adds up to a certain value
 * @author surendrapanday
 */
public class FindSumIndex {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        // target = 9
        for (int i = 0; i < nums.length - 1; ++i) {
            int target = nums[i] + nums[i + 1];
            if (target == 9) {
                System.out.print("Indices are : [" + nums[i] + " , " + nums[i + 1] + "]");

            }
        }
    }

}
