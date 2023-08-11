import java.util.Scanner;

public class program4 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int rev = 0, rem = 0;

        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        scanner.close();
        System.out.println("The reverse of your number is : " + rev);

    }
}
