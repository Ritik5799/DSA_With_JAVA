class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += check(num); // Accumulate sum for each valid number
        }
        return total;
    }

    private int check(int n) {
        // Look for the first divisor 'i'
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int j = n / i; 

                // Case: n = p * q (e.g., 6, 10, 15)
                if (i != j && isPrime(i) && isPrime(j)) {
                    return 1 + i + j + n;
                }
                
                // Case: n = p^3 (e.g., 8, 27)
                if (i * i == j && isPrime(i)) {
                    return 1 + i + i * i + n;
                }

                return 0; // Found divisors, but not exactly four
            }
        }
        return 0; // Number is prime (only 2 divisors)
    }

    private boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
