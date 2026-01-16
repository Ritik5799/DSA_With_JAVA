  class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,len=nums.length;
        for(int i:nums){
            sum+=i;
        }
        return (len*(len+1))/2-sum;
    }
}
