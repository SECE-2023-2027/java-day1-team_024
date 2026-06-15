import java.util.Scanner;

public class FifthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        double num = sc.nextDouble();

        String binary = Integer.toBinaryString((int) num);

        System.out.println("Binary number is: " + binary);

        sc.close();
    }
}
