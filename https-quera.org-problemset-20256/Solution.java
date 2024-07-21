import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int countR = 0;
        int countG = 0;
        int countY = 0;
        for (char c : string.toCharArray()) {
            if (c == 'R') {
                countR++;
            } else if (c == 'G') {
                countG++;
            } else if (c == 'Y') {
                countY++;
            }
        }

        if (countR >= 3 || countG == 0 || (countR >= 2 && countY >= 2)) {
            System.out.println("nakhor lite");
        } else {
            System.out.println("rahat baash");
        }
    }

}
