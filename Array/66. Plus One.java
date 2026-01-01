  class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;   //we increase the last digit by 1
            if (digits[i] < 10) {     // If after incresing digit is less than 10 it mean's now no carry needed
                return digits;      //return the digit
            }
            digits[i] = 0;      //If the digits is not return then it have carry so replace that number with 0
        }
      //if digit is not returned yet it means's all the element of digits is 9 so
        int[] result = new int[digits.length + 1];   //make a new array of size +1 than previous
        result[0] = 1;       //make the 1st element 1 and by default all the other element will be 0
        return result;      // Return the result
    }
}
