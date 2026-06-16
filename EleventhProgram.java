import java.util.Scanner;
public class EleventhProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The string is :  ");
        String s = sc.nextLine();
        int letters = 0, spaces = 0, numbers = 0, others = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) numbers++;
            else if (Character.isSpaceChar(c)) spaces++;
            else others++;
        }
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}
