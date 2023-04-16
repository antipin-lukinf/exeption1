public class Main {
    public static void main(String[] args) {


//        Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//        Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
//        новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//*       Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//                каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.


        int[] inputArray1 = new int[]{1, 5, 9, 3};
        int[] inputArray2 = new int[]{2, 6, 8, 4};


        int[] arr = sumArray(inputArray1, inputArray2);

        try {
            System.out.println(arr);

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static int[] sumArray(int[] inputArray1, int[] inputArray2){
        int[] resultArray = new int[inputArray1.length];
        if (inputArray1.length != inputArray2.length) {
            throw new RuntimeException("Массивы не одинаковы");
        }
        if (inputArray1.length == 0) {
            throw new RuntimeException("Массив 1 пустой");
        }
        if (inputArray2.length == 0) {
            throw new RuntimeException("Массив 2 пустой");


        }else if (inputArray1.length == inputArray2.length){
            for (int i = 0; i < inputArray1.length; i++){
                resultArray[i] = inputArray2[i] - inputArray1[i];

            }

        }
        return resultArray;

    }
}