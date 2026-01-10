class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        int sum=0,best=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]==1) ? 1:-1;
            Integer idx=map.get(sum);
            if(idx!=null){
                best=Math.max(best,i-idx);
            }
            else {
                map.put(sum,i);
            }
        }
        return best;
    }
}
