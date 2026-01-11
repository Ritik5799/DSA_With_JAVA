  class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;     //1 is divisor by only one
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                int q = num / i;
                if (q != i) sum += q; // avoid double-counting square root
            }
        }
        return sum == num;
    }
}
