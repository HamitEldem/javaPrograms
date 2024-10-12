class Solution {
    public boolean isPalindrome(int x) {
       int original, reversed;

       original = x;
       reversed = 0;

       while(x > 0){
        reversed = reversed * 10 + (x % 10);
        x /= 10;
       }

       
       return (boolean)(reversed == original);


    }
}
