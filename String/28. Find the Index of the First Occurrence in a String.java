
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);      //It give the index value of given substring if present else it giive -1
    
}
//Aternate approach
/*
class Solution {
    public int strStr(String haystack, String needle) {
        int nl=needle.length();
        for(int i=0;i<=haystack.length()-nl;i++){      //
            if(haystack.substring(i,i+nl).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

}  */
