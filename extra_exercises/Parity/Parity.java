import java.util.Scanner;

public class Parity {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int result = scanner.nextInt();

        if (result % 2 == 0){
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }

        scanner.close();
    }
}