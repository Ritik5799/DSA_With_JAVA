  class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(x>0 || y>0){      //The loop will be working till both of the number not become zero
            if( (x&1) != (y&1) ){      //taking both number's last bit and comparing it
                count++;
            }
            x=x>>1;                //right shift tthe number
            y=y>>1;
        }
        return count;
    }
}
