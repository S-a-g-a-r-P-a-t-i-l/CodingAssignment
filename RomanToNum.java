import java.util.HashMap;
import java.util.Scanner;

public class RomanToNum {
    public static int romanToInt(String str) {

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        try {

            for (int i = str.length() - 1; i >= 0; i--) {
                if (romanMap.containsKey(str.charAt(i))) {
                    int currentValue = romanMap.get(str.charAt(i));

                    if (currentValue < prevValue) {
                        result -= currentValue;
                    } else {
                        result += currentValue;
                    }

                    prevValue = currentValue;
                } else {
                    throw new Exception("Invalid input");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman number...");
        String romanNumeral = sc.nextLine();
        sc.close();
        int integerEquivalent = romanToInt(romanNumeral);
        if (integerEquivalent != 0) {
            System.out.println("The integer equivalent of " + romanNumeral + " is: " + integerEquivalent);

        } else {

        }

    }
}
