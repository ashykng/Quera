import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        String[] stringArray = scanner.nextLine().split(" ");

        String[] reversedArray = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            reversedArray[i] = stringArray[stringArray.length - 1 - i];
        }

        String res = String.join(" ", reversedArray);

        System.out.println(res);
    }

}
