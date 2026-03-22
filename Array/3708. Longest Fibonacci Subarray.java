class Solution {
    public int longestSubarray(int[] nums) {
      int count=2,res=2;
      for(int i=2;i<nums.length;i++){
        if(nums[i]==nums[i-1]+nums[i-2]){            //Chexk if the current element is equl to sum of previous 2 element
          count++;                                  //if it is fibonacci number then increase the value of count
          res=Math.max(res,count);                  //Store the maximun length of fibonacci sequence
        }else{
          count=2;                                   //If it is not fibonacci number then reset the count to 2
        }
      }
      return res;                                    //return the res
    }
  }
