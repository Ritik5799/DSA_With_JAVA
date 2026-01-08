//In this problem we will maintain a window of size k, if any duplicate number is prresent in that window it means it will satisfy both condition
import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Set to store numbers within the current "window" of size k
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            //If the number is already in the set, a duplicate exists within distance k
            if (window.contains(nums[i])) {
                return true;
            }

            // Add the current number to the window
            window.add(nums[i]);

            // If the window grows larger than k, remove the oldest element
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}
