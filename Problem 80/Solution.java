/**
This solution si written by Yizhuo Du
Sept 30, 2019
*/

public class Solution {
  public int removeDuplicates(int[] nums) {
       if (nums.length < 3) return nums.length;

      int pre = 0, cur = 1, count = 1, len = nums.length;
      while (cur < len) {
          if (nums[pre] == nums[cur]) {
              if (count < 2) {
                  nums[pre + 1] = nums[cur];
                  pre++;
                  cur++;
                  count++;
              } else {               
               cur++;
              }
          } else {
              nums[pre + 1] = nums[cur];
              pre++;
              cur++;
              count = 1;
          }
      }
      return pre + 1;
  }
}
