import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        // CHECK WHETHER THE NUMBER IS PALINDROME OR NOT
        int rev = 0, rem = 0;

        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int pal = num;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        scanner.close();
        if (pal == rev) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }

    }
}
