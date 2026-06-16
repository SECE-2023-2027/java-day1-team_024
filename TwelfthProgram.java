import java.util.Scanner;
public class TwelfthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character: ");
        String line = sc.nextLine();
        char c = line.length() > 0 ? line.charAt(0) : '\0';
        System.out.println("The ASCII value of " + c + " is :" + (int)c);
    }
}
