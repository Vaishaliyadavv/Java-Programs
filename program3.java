
// WAP TO PRINT MULTIPLICATION  TABLE OF A NUMBER 
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");

        int i = 1;
        while (i <= 10) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
            i++;
        }

        scanner.close();
    }
}
