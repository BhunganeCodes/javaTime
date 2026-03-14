import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int threshold = 18;

        System.out.print("How old are you?: ");
        int result = scanner.nextInt();

        if (result < threshold) {
            System.out.println("Access Denied!");
        } else {
            System.out.println("Access Granted!");
        }
        

        scanner.close();
    }
}