import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }
    
    
    private static void app() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = num;
        for (int i = 1; i <= num / 2 ; i++){
            if (num % i == 0)
                res -= i;
        }
        
        if (res == 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }

}
