  class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (!sameGroup(s1.charAt(0), s1.charAt(2), s2.charAt(0), s2.charAt(2))) {
            return false;
        }
        if (!sameGroup(s1.charAt(1), s1.charAt(3), s2.charAt(1), s2.charAt(3))) {
            return false;
        }
        return true;
    }
    //Helper function to check  whether char can be equal after swapping
    private boolean sameGroup(char a, char b, char x, char y) {
        return (a == x && b == y) || (a == y && b == x);
    }
}
