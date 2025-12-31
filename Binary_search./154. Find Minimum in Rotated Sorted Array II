  class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (nums[l] == nums[mid] && nums[mid] == nums[h]) {
                // Shrink the search space when duplicates block decision
                l++;
                h--;
            } else if (nums[mid] > nums[h]) {
                // Minimum must be in the right half
                l = mid + 1;
            } else {
                // Minimum is in the left half (including mid)
                h = mid;
            }
        }
        return nums[l];
    }
}
