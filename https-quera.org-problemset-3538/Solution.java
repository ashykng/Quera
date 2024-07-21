import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        ArrayList<String> first = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        scanner.nextLine();
        ArrayList<String> second = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        scanner.nextLine();
        ArrayList<String> third = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(first);
        combined.addAll(second);
        combined.addAll(third);

        ArrayList<String> days = new ArrayList<>(Arrays.asList("shanbe", "1shanbe", "2shanbe", "3shanbe", "4shanbe", "5shanbe", "jome"));

        HashSet<String> daysSet = new HashSet<>(days);

        for (String day : combined) {
            daysSet.remove(day);
        }

        System.out.println(daysSet.size());
    }

}
