/**
This solution is written by Yizhuo Du
Sept 29, 2019
*/

/**
 * Two-pass HashMap
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

import java.util.HashMap;


public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if ( map.containsKey(complement) && map.get(complement) != i)
                return new int[] {i, map.get(complement)};
        }

        return new int[0];
    }
}
