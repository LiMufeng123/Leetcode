import java.util.Arrays;

public class 斐波那契 {
    public static int fib(int n) {
        long []memo = new long[n+1];
        Arrays.fill(memo,-1);
        memo[0]=0;
        memo[1]=1;
        long res = fib1(n,memo);
        System.out.println(res);
        System.out.println(memo[n]+" "+memo[n-1]);
        return (int)res;
    }
    public static long fib1(int k,long []memo){
        if(k==0||k==1)   return k;
        if(memo[k]!=-1)  return memo[k];
        memo[k] = fib1(k-1,memo) + fib1(k-2,memo);
        memo[k] %= 1000000007;
        return memo[k];
    }
    public static int fib2(int n) {
        //自下而上

        int []f = new int[n+1];
        if(n==0)    return 0;
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++)
            f[i] = (f[i-1] + f[i-2])%1000000007;
        return f[n];

    }
    public static void main(String[] args) {
        System.out.println(fib2(45));
    }
}
