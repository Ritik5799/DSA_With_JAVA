class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if((numbers[r]+numbers[l])==target){ //If we found the target equals to sum then break the loop because no need to check further
                break;
            }
            else if((numbers[r]+numbers[l])>target){       //If the sum is greater than target it mean the we need smaller element so r--
                r--;
            }
            else{  //Otherwise l--
                l++;
            }
        }
        return new int[] {l+1,r+1};   //return the array of both index+1
    }
}
