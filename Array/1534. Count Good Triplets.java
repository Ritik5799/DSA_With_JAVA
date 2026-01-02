class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length, count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if(Math.abs(arr[i] - arr[j]) > a){     //If 1st condition fails it means we have not to go in 3rd loop
                    continue;  
                }  
                    for (int k = j + 1; k < n; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {           //when these both condition is also true it means the triplet satisfy all condition
                            count++;
                    }
                }
                
            }
        }
        return count;
    }
}
