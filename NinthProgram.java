import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(input);
        
      
        System.out.print("Input an integer: ");
        int number = input.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        
    
        number = Math.abs(number);
        
        while (number > 0) {
            sum += number % 10; 
            number = number / 10; 
        }
        
        System.out.println("The sum of the digits is: " + sum);
        
        input.close();
    }
}