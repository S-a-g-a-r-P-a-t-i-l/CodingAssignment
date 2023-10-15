import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String input) {

        input = input.toLowerCase();

        Set<Character> mySet = new HashSet<>();

        for (char ch : input.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                mySet.add(ch);
            }
        }

        return mySet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
