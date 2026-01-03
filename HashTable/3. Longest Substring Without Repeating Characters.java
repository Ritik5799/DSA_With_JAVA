class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);   //We will get the current element 
            while (set.contains(current)) {    //If current element is already present in set we will removing element from left most element until  the element removed which is already present
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);             //Now add the element in set
            maxLength = Math.max(maxLength, right - left + 1);     //store the maximun length which has not any duplicates
        }

        return maxLength;            //return the maximum length of string which has not any duplicate
    }
}
