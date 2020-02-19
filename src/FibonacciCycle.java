public class FibonacciCycle {
    public static void main(String[] args){
        int n0 = 1;
        int n1 = 1;
        int n2;
        int k = 11;

        System.out.print(n0 + " " + n1 + " ");
        for(int i = 3; i <= k; i ++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
