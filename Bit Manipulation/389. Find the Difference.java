  class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char a : s.toCharArray()){          //convert the string innto char array
            res^=a;                            //applying xor to each char in string s
        }
        for(char a : t.toCharArray()){
            res^=a;                            //applying xor to each char in string t
        }
        return res;
    }
}
