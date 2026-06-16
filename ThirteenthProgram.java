import java.util.Scanner;
public class ThirteenthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        long n = sc.nextLong();
        System.out.println((n % 2 == 0) ? 1 : 0);
    }
}
