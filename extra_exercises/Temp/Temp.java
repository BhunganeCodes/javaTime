import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int threshold = 30;

        System.out.print("What is the current temperature?: ");
        int result = scanner.nextInt();

        if (result <= threshold){
            System.out.println("It's not hot.");
        } else {
            System.out.println("It's hot!");
        }
        
        scanner.close();
    }
}