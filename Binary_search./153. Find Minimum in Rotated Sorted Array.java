    class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (l < h) {
            int mid = left + (right - left) / 2;  
            
            if (nums[mid] > nums[right]) {    #If mid element is greater than the rightmost element it means the minimum lies in the right half (excluding mid)

                left = mid + 1;
            } else {                         #Otherwise, the minimum lies in the left half (including mid)
                right = mid;
            }
        }
        
        return nums[left];           #At the end, left == right, pointing to the minimum element
    }
}
