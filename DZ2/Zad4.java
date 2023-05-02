import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь
//  вводит пустую строку. Пользователю должно показаться сообщение, 
//  что пустые строки вводить нельзя.

public class Zad4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                scanner.close();
                throw new Exception("Пустые строки вводить нельзя.");
            }
            scanner.close();
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}
