/**
This Solution is written by Yizhuo Du
Sept 30, 2019
*/

public class Solution {
  public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;  //no possible duplicates

        int pre = 0, cur = 0, len = nums.length;

        while (cur < len) {
            if (nums[pre] == nums[cur])
                cur++;                       //if the values are equal, update the cur
            else {
                nums[pre + 1] = nums[cur];  //if the values are not equal, store the value in cur to the next spot of pre
                pre++;                      //update both pointers
                cur++;
            }
        }
        return pre + 1;     //return the total number of different numbers
    }
}
