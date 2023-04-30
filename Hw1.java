import java.util.Scanner;

public class Hw1 {
        public static void main(String[] args) {
            int number = 30;
            double valueDouble = number;
            int valueInt = 20;
            String valueString = "Learning session";
            double valueDouble2 = 23.63;
            
            System.out.printf("number = %d\n", number);
            System.out.printf("valueDouble = %.2f\n", valueDouble);
            System.out.printf("valueInt = %d\n", valueInt);
            System.out.printf("valueString = %s\n", valueString);
            System.out.printf("valueDouble2 = %.2f\n", valueDouble2);

            
            Scanner s = new Scanner(System.in);

            System.out.println("Enter an integer value: ");
            int intValue = s.nextInt();

            System.out.println("Enter a double value: ");
            double doubleValue = s.nextDouble();

            System.out.println("Enter a character: ");
            char charValue = s.next().charAt(0);

            System.out.println("Enter a string: ");
            String stringValue = s.next();

            System.out.println("You entered the values:");
            System.out.printf("Integer: %d\n", intValue);
            System.out.printf("Double: %.2f\n", doubleValue);
            System.out.printf("Character: %c\n", charValue);
            System.out.printf("String: %s\n", stringValue);

            s.close();
        }
}
