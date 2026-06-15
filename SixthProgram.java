import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a decimal number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Hexadecimal number is : " +
                               Integer.toHexString(num).toUpperCase());
        } else {
            System.out.println("Please enter a whole number (integer), not a decimal value.");
        }

        sc.close();
    }
}