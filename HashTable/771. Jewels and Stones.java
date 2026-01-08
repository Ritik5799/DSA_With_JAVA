class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
      //First store all the characters of jewels in set , because all the char in jewels is unique
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
      //Now check if any stones char is present in set or not
      //if presentn then increase the count by 1
        for(int i=0;i< stones.length();i++){
            if(set.contains(stones.charAt(i))) count++;
        }
        return count;
    }
}
