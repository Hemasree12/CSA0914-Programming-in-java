import java.io.*;
class sumevenfib {
    static int Fib_Even_Sum(int N)
    {
        if (N <= 0)
            return 0;
        int fib[] = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;
        int s = 0;
        for (int j = 2; j <= 2 * N; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];
            if (j % 2 == 0)
                s += fib[j];
        }
        return s;
    }
    public static void main(String[] args)
    {
        int N = 4;
        System.out.println(
            "Even sum of fibonacci series till number " + N
            + " is: " + +Fib_Even_Sum(N));
     }
}
