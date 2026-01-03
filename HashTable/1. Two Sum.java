// As we have to get target we konw a+b=c  => b=c-a   we will be using this property  we are not adding two elements because it may cause overflow

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (map.containsKey((target)-nums[i])){       // If targer-nums[i]  is already present in HashMap it means sum these 2 element == target
                return new int[]{map.get(target-nums[i]),i};        //return the result

            }
            else{                                   //Otherwise Put the element in HashMap
                map.put(nums[i],i);
            }

        }
        return new int[]{0,0};
    }
}
