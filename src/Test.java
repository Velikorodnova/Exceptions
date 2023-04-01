import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Число 1 - ");
            int number1 = scanner.nextInt();
            System.out.println("Число 2 - ");
            int number2 = scanner.nextInt();
            int dividedNumber = number1 / number2;
            System.out.println("Результат - " + dividedNumber);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Произошла ошибка, попробуйте еще раз!");
        }
    }
}
