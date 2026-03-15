import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the desired height for your triangle?: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < height - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}