class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int rem=0;
        int val = n;

        while(n!=0){
            rem = n%10;
            sum += rem;
            mul *= rem;
            n= n/10;
        }

        int ans = val % (mul + sum);

        if(ans == 0){
            return true;
        }

        return false;
    }
}