  class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; 
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            if (map.getOrDefault(i, 0) != expected) {
                return false;
            }
        }
        return true;
    }
}
