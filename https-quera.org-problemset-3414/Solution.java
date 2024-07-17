import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);

        if (x1 == x2) {
            System.out.println("Vertical");
        } else if (y1 == y2) {
            System.out.println("Horizontal");
        } else {
            System.out.println("Try again");
        }
    }

}
