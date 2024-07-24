import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        float m = scanner.nextFloat();

        double bmi = n / Math.pow(m, 2);

        bmi = Math.round(bmi * 100.0) / 100.0;

        System.out.printf("%.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
