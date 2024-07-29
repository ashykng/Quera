import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int res = 0;

        for (int i = 0; i < n; i++)
            res += scanner.nextInt();

        if (res >= k)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
