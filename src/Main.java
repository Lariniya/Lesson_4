public class Main {
    public static void main(String[] args) {

        int k = 11;
        for (int i = 1; i <= k; i++) {
            int result = FibonacciRecursion.countFibonacci(i);
            System.out.print(result + " ");
        }
    }
}