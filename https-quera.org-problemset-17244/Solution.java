import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int res = 0;

        for (int i = 0; i < num; i++) {
            res += i + 1;
        }

        System.out.println(res);
    }

}
