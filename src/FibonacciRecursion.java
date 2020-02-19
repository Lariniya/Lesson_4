import org.w3c.dom.ls.LSOutput;

public class FibonacciRecursion {

    public static int countFibonacci(int n){
        if(n==0)
            return 0;
        if(n==1 || n ==2)
            return 1;
        return countFibonacci(n-1) + countFibonacci(n-2);
    }
}
