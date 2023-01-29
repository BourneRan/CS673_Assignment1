public class Fibonacci {
    public static long Fibonacci(int n){
        if(n<1){
            return -1;
        }

        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


    public static void main(String[] args) {
        long ans = Fibonacci(100);
        System.out.println(ans);
    }
}
