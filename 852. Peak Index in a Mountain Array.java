#In this question we have to search the peak element index after which the array start decreasing 
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]) left=mid+1;     #We check if mid element is smaller than its next one or not if it is smaller it means the target is in right side of mid element
            else right=mid;                         #Otherwise the target element is on right side of mid element


        }   
        # At the end left==right
        return left;
    }
}
