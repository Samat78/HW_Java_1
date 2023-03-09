// Урок 1. Знакомство с языком программирования Java
// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
// .
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class Main
//{
//    public static void main(String[] args)
//    {
//        Integer[] A = new Integer[]{1, 2, 3, 4, 5, 6};
//
//        List<Integer> ints = Arrays.asList(A);
//
//        System.out.println("Min element is " + Collections.min(ints));
//        System.out.println("Max element is " + Collections.max(ints));
//    }
//}
//

// 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
// не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

//import java.util.Scanner;
//public class program {
//
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите год: ");
//        int year = in.nextInt();
//        System.out.println(is_LeapYear(year));
//    }
//
//    public static boolean is_LeapYear(int y)
//    {
//        boolean a = (y % 4) == 0;
//        boolean b = (y % 100) != 0;
//        boolean c = ((y % 100 == 0) && (y % 400 == 0));
//        return a && (b || c);
//    }
//}

// 3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//а остальные - равны ему.

//
//public class program {
//    public static void main(String... args) {
//        int[] array = new int[]{3, 2, 2, 3};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] *4;
//            System.out.println(array[i]);
//        }
//    }
//}