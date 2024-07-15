import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }
    
    
    private static void app() {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        for (char digitChar : num.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            System.out.print(digitChar + ": ");
            for (int i = 0; i < digit; i++) {
                System.out.print(digitChar);
            }
            System.out.println();
        }
    }

}
