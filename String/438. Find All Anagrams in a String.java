class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        // If s is shorter than p, no anagram can exist
        if (s.length() < p.length()) return result;

        int[] countP = new int[26];  // Target character counts (p)
        int[] window = new int[26];  // Current window character counts (s)

        // Count characters in string p
        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        int lenP = p.length();

        // Set up the very first window of size p
        for (int i = 0; i < lenP; i++) {
            window[s.charAt(i) - 'a']++;
        }

        //Check if the first window is an anagram
        if (Arrays.equals(window, countP)) {
            result.add(0);
        }

        //Slide the window through the rest of string s
        for (int i = lenP; i < s.length(); i++) {
            // Include the next character on the right
            window[s.charAt(i) - 'a']++;
            
            // Drop the character that is now outside on the left
            window[s.charAt(i - lenP) - 'a']--;

            // If the counts match, we found a start index
            if (Arrays.equals(window, countP)) {
                result.add(i - lenP + 1);
            }
        }

        return result;
    }
}
