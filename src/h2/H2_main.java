package h2;

public class H2_main {
    private static long[] cache = new long[1000];

    public static void main(String[] args) {
        benchmark(8);
    }

    public static void benchmark(int n) {
        long start, ende, ergebnis;

        start = System.nanoTime();
        ergebnis = fibonacci(n);
        ende = System.nanoTime();
        System.out.println("Ergebnis: " + ergebnis + " | Elapsed nanoseconds (fibonacci(" + n + ")): " + (ende - start));

        start = System.nanoTime();
        ergebnis = fibonacciCached(n);
        ende = System.nanoTime();
        System.out.println("Ergebnis: " + ergebnis + " | Elapsed nanoseconds (fibonacciCached(" + n + ")): " + (ende - start));

        start = System.nanoTime();
        ergebnis = fibonacciIterative(n);
        ende = System.nanoTime();
        System.out.println("Ergebnis: " + ergebnis + " | Elapsed nanoseconds (fibonacciIterative(" + n + ")): " + (ende - start));
    }

    public static long fibonacci(int n) {
        if (n <= 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciCached(int n) {
        if (n <= 2) {
            return 1;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        long f = fibonacciCached(n - 1) + fibonacciCached(n - 2);
        cache[n] = f;
        return f;
    }

    public static long fibonacciIterative(int n) {
        long f = 0;
        long prev1 = 1;
        long prev2 = 1;
        if (n <= 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            f = prev1 + prev2;
            prev2 = prev1;
            prev1 = f;
        }
        return f;
    }

}
