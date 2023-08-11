import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        // wap to print first and last digit of a no.
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int firstDigit = num;
        scanner.close();

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        int lastDigit = num % 10;

        System.out.println("The first digit is  : " + firstDigit + " and " + "The last digit is  : " + lastDigit);

    }
}
