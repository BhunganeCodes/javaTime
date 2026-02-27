import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your passing grade: ");
        double grade = scanner.nextDouble();

        System.out.print("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your grade is: " + grade);

        if (isStudent){
            System.out.println("You are a student");

        } else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}