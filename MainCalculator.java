import java.util.Scanner;
class Maincalculator{
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = readNumber(scanner);

        System.out.print("Enter the second number: ");
        double secondNumber = readNumber(scanner);

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = 0.0;

        if (secondNumber != 0) {
            quotient = firstNumber / secondNumber;
        } else {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        if (secondNumber != 0) {
            System.out.println("Division: " + quotient);
        }

        scanner.close();
    }

    private static double readNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Try again: ");
                scanner.next(); 
            }
        }
    }
}
