/**
This solution is written by Yizhuo Du
Sept 29, 2019
*/

/**
 * One-pass HashMap
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

 public class Solution2 {
   public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement))
                return new int[] {i, map.get(complement)};

            map.put(nums[i], i);
        }

        return new int[0];
    }
 }
