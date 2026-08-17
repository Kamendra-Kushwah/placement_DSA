// Recursion Solution    TC-O(2^n)
class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }
}

// Memoization Solution      TC- O(2*n)~O(n)
class Solution {
    public int climbStairs(int n) {
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,dp);
    }
    public int climb(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=climb(n-1,dp)+climb(n-2,dp);
    }
}

// Tabulation   TC: O(n)
class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int [] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

// space optimized
class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int a=1;
        int b=2;
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
