import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String userInput = scanner.nextLine();
            Set<Character> uniqueLetters = new HashSet<>();
            for (char c : userInput.toCharArray()) {
                uniqueLetters.add(c);
            }
            int maxLetters = uniqueLetters.size();
            if (res <= maxLetters) {
                res = maxLetters;
            }
        }

        System.out.println(res);
    }
}
