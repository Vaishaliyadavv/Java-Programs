import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        // wap to print the factorial of a no
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int factr = 1, i = 1;

        while (i <= num) {
            factr *= i;
            i++;
        }

        System.out.println("The factorial of " + num + "is : " + factr);

    }
}
