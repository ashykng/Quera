import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        int sum = n1 + n2 + n3 + n4;
        int product = n1 * n2 * n3 * n4;
        double average = sum / 4.0;
        int max = Math.max(Math.max(n1, n2), Math.max(n3, n4));
        int min = Math.min(Math.min(n1, n2), Math.min(n3, n4));
        

        System.out.printf("Sum : %.6f%n", (double) sum);
        System.out.printf("Average : %.6f%n", average);
        System.out.printf("Product : %.6f%n", (double) product);
        System.out.printf("MAX : %.6f%n", (double) max);
        System.out.printf("MIN : %.6f%n", (double) min);
    }
}
