  class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int n = part.length();

        int index = sb.indexOf(part);
        while (index != -1) {
            sb.delete(index, index + n);
            index = sb.indexOf(part); 
        }

        return sb.toString();
    }
}
