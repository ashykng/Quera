import java.util.Scanner;

public class Solution {

    public static void app() {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");
        
        int n = Integer.parseInt(inputs[0]);
        String string = inputs[1];
        for (int i = 0; i < n; i++) {
            System.out.print("copy of ");
        }
        System.out.println(string);
    }

    public static void main(String[] args) {
        app();
    }
}
