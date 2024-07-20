import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        String saal = num.substring(0, 2);
        String maah = num.substring(2);

        System.out.println("saal:" + saal);
        System.out.println("maah:" + maah);
    }

}
