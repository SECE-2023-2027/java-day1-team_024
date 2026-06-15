import java.util.Scanner;

public class SeventhProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Octal number is: " +
                               Integer.toOctalString(num));
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        sc.close();
    }
}