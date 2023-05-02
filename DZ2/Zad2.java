import java.util.random.RandomGenerator;

// Если необходимо, исправьте данный код

public class Zad2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = Array(5);
            double catchedRes1 = intArray[1] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } 
        catch (ArithmeticException e){
            System.out.println("Ошибка при делении: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка в размере массива: " + e);
        } 
        catch (Exception e) {
            System.out.println("Ошибка непредвиденная: " + e);
        }
    }

    private static int[] Array(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomGenerator.getDefault().nextInt(100);
            System.out.print(array[i]+" ");
        }
        return array;
    }
}
