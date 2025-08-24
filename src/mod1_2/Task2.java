package mod1_2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the first leg: ");
        double leg1 = scanner.nextDouble();
        System.out.println("Enter the length of the second leg:");
        double leg2 = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        System.out.printf("Hypotenuse length: %.2f", hypotenuse);

        scanner.close();
    }
}