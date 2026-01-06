class Solution {
    public String reverseVowels(String s) {
        // Convert to char array since Strings are immutable in Java
        char[] word = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            // Move left pointer until a vowel is found
            while (left < right && vowels.indexOf(word[left]) == -1) {
                left++;
            }
            // Move right pointer until a vowel is found
            while (left < right && vowels.indexOf(word[right]) == -1) {
                right--;
            }
            
            // Swap the vowels
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            
            // Move pointers inward
            left++;
            right--;
        }
        
        return new String(word);
    }
}
