class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums)
        {
            if(!s.add(i))            //As there is only one number is duplicate so it check if number is already add or not
              return i;
        }
        return nums[nums.length-1];
    }
}
