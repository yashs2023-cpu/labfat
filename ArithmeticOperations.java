import java.util.Scanner; // Import Scanner for user input

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // 1. Addition (+)
        int sum = num1 + num2;
        
        // 2. Subtraction (-)
        int difference = num1 - num2;
        
        // 3. Multiplication (*)
        int product = num1 * num2;
        
        // 4. Division (/) 
        // Note: Use (float) to keep decimal values
        float quotient = (float) num1 / num2; 
        
        // 5. Modulus (%) - Returns the remainder
        int remainder = num1 % num2;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        sc.close();
    }
}
