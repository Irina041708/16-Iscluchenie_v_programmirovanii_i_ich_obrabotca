// Дан следующий код, исправьте его там, где требуется 

public class Zad3 {
    public static void main(String[] args){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;//Массив выходит за пределы своего размера
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {//нельзя ставить общие ошибки вперед . Самым базовым классом для всех исключений является класс Throwable
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b)  {
        System.out.println(a + b);
    }

}
