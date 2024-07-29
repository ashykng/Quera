import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String userInput = scanner.nextLine();
            if (userInput.contains("HAFEZ") || userInput.contains("MOLANA"))
                res.add(i);
        }

        if (!res.isEmpty())
            for (int index : res)
                System.out.print(index + " ");
        else
            System.out.println("NOT FOUND!");
    }
}
