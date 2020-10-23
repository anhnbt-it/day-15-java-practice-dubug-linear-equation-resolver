import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/23/2020
 * Time: 9:56 AM
 */
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = input.nextDouble();

        System.out.print("Enter b number: ");
        double b = input.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
