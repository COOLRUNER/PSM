public class Main {
    public static void main(String[] args) {
        int n = 10;
        int x = 1;
        double sin = 0;
        for (int i = 0; i < n; i++) {
            sin += Math.pow(-1, i) / fact(2 * i + 1) * Math.pow(x, 2 * i + 1);
        }
        System.out.println("Sinus of " + x + " is " + sin);
        System.out.println( "Test " + Math.sin(x));

    }

    public static long fact(int a) {
        long res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }
}