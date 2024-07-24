import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Set<Integer> fibs = new HashSet<>();
        for (int fib : fib(num)) {
            fibs.add(fib);
        }

        for (int i = 1; i <= num; i++) {
            if (fibs.contains(i)) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }

    public static Iterable<Integer> fib(int n) {
        return () -> new java.util.Iterator<>() {
            private int a = 1, b = 1, count = 0;

            @Override
            public boolean hasNext() {
                return count < n;
            }

            @Override
            public Integer next() {
                int current = a;
                int next = a + b;
                a = b;
                b = next;
                count++;
                return current;
            }
        };
    }
}
