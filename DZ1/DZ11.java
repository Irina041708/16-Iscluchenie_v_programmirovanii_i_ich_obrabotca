// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//  и возвращающий новый массив, каждый элемент которого равен разности элементов 
//  двух входящих массивов в той же ячейке. Если длины массивов не равны,
//   необходимо как-то оповестить пользователя.
// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//  и возвращающий новый массив, каждый элемент которого равен частному элементов двух 
//  входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
//  как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
//   которое пользователь может увидеть - RuntimeException, т.е. ваше.


package DZ1;

public class DZ11 {

    public static void main(String[] args) {
        int[] arr1 = {8,15,12};
        int[] arr2 = {4,5,6};

        int[] result = differenceArr(arr1,arr2);
        print(result);

        int[] result2 = divisionArr(arr1,arr2);
        print(result2);
        
    }

    public static void lengthArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            throw new RuntimeException("Массивы разной длины");
        }
    }

    public static void notEmptyArr(int[] arr) {
        if (arr == null){
            throw new NullPointerException("Массив Null");
        }
        if (arr.length == 0){
            throw new RuntimeException("Массив пустой");
        }
    }

    public static void zeroElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                throw new RuntimeException("Элемент массива равен 0. Деление на 0 невозможно.");
            }
        }
    }

    public static int[] differenceArr(int[] arr1, int[] arr2) {
        notEmptyArr(arr1);
        notEmptyArr(arr2);
        lengthArr(arr1, arr2);
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] - arr2[i];
        }
        return result;   
    }

    public static int[] divisionArr(int[] arr1, int[] arr2) {
        notEmptyArr(arr1);
        notEmptyArr(arr2);
        lengthArr(arr1, arr2);
        zeroElement(arr2);
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] / arr2[i];
        }
        return result;   
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }  
        System.out.print("]");
        System.out.println();
    }

    
    // public static int sum2d(String[][] arr) {
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++){
    //         for (int j = 0; j < 5; j++){
    //             int val = Integer.parseInt(arr[i][j]);
    //             sum += val;
    //         }
    //     }
    //     return sum;
    // }
}
