import java.util.Scanner;
public class FifteenthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        System.out.print("Input the third number : ");
        int c = sc.nextInt();
        int ra = a % 10;
        int rb = b % 10;
        int rc = c % 10;
        boolean result = (ra == rb) || (ra == rc) || (rb == rc);
        System.out.println("The result is: " + result);
    }
}
