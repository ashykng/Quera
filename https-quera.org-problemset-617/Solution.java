import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        
        String reversedNum = new StringBuilder(num).reverse().toString();
        
        if (num.equals(reversedNum))
            System.out.println("YES");

        else 
            System.out.println("NO");
    }

}
