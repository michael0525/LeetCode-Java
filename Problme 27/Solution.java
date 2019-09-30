/**
This solution is written by Yizhuo Du
Sept 30, 2019
*/

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;

        int res = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] != val) {
                nums[res++] = nums[i];
            }
        }
        return res;
    }
}
