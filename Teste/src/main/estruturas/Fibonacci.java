package main.estruturas;

public class Fibonacci {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo (n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("30 primeiros termos fibo");
        for (int i = 0; i < 30; i++) {
            System.out.printf("(%d): %d%n", i, fibo(i) );
        }
    }
}
