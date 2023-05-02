import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Zad1 {
    public static void main(String[] args) {
        boolean ExceptionWhile = false;

        while (ExceptionWhile == false) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите дробное число: ");
                float number = scanner.nextFloat();
                System.out.println("Вы ввели число: " + number);
                ExceptionWhile = true;
                scanner.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}