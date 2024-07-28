//Leetcode
//Leetcode weeklycontest 408
// my solution -------  more better solution downside
  class Solution {
    public boolean canAliceWin(int[] nums) {
        Arrays.sort(nums);
        
         int singleDigitCount = 0;
        int doubleDigitCount = 0;

        // Count single-digit and double-digit numbers
        for (int num : nums) {
            if (num >= 0 && num <= 9) {
                singleDigitCount+=num;
            } else if (num >= 10 && num <= 99) {
                doubleDigitCount+=num;
            }
        }
        if( singleDigitCount ==  doubleDigitCount){
            return false;
        }
        else{
            return true;
        }
    }
}


// more better solution 
  class Solution {
    public boolean canAliceWin(int[] nums) {
        int n1 = 0;
        int n2 = 0;

        for (int num : nums) {
            if (num >= 10) {
                n1 += num;
            } else {
                n2 += num;
            }
        }

        return n1 != n2;
    }
}
