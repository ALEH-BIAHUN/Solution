public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("==============================");

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for(int i = array.length - 1; i >=0; i--) {
            System.out.println(array[i]);
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        int tmp;
        for( int i = 0; i < array.length / 2; i++) {

            tmp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = tmp;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }
}
