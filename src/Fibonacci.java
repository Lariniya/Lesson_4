public class Fibonacci {
    public static void main(String[] args) {



        int k = 11;
        int n0 = 1;
        int n1 = 1;
        int n2;
        private static int calculationFibonacci (k, n0, n1){
            System.out.print(n0 + " " + n1 + " ");
            for (int i = 3; i <= k; i++) {
                n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;
            }
            System.out.println();
        }

        private static int calculationRecursionFibonacci ( int k){
            if (k == 0) {
                return 0;
            }
            return k + calculationRecursionFibonacci(k - 1);
        }
    }
}
