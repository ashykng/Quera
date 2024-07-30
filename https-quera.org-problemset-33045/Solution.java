import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisorCount = 0;
        long sum = 0;

        for (int n = 1; n <= num; n++) {
            List<Integer> divisors = divisorGenerator(n);
            divisorCount += divisors.size();
            for (int div : divisors) {
                sum += div;
            }
        }

        System.out.println(divisorCount + " " + sum);
    }

    public static List<Integer> divisorGenerator(int num) {
        List<Integer> divisors = new ArrayList<>();
        List<Integer> largeDivisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i * i != num) {
                    largeDivisors.add(num / i);
                }
            }
        }
        for (int i = largeDivisors.size() - 1; i >= 0; i--) {
            divisors.add(largeDivisors.get(i));
        }
        return divisors;
    }
}
