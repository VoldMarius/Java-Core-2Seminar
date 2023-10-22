import methods.ArrayPrinting;
import methods.Returner_number_even_elements;

import java.util.Random;

import static methods.Diff_Largest_Smallest.getDifference;
import static methods.TwoAdjacentElemZeroValue.hasZeroNeighbors;

public class Main {
    public static <nt> void main(String[] args) {
        int[] nums = new int[20];
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(10);
        }
        // метод, возвращающий количество чётных элементов массива.
        int number_even = Returner_number_even_elements.countEvens(nums);
        ArrayPrinting printing = new ArrayPrinting();
        System.out.println("Задача №1");
        System.out.println("Количество четных элементов в массиве: ");
        printing.print_array(nums);System.out.print( "  равно =>  "+number_even);

        // функция, возвращающую разницу между самым
        // большим и самым маленьким элементами переданного не пустого массива.
        int difference = getDifference(nums);
        System.out.println(" ");
        System.out.println("Задача №2");
        System.out.println("Разница между самым\n" +
                " большим и самым маленьким элементами в массиве: " + difference);

        // функция, возвращающая истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
        int[] nums1 = new int[10];
        Random rand1 = new Random();
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = rand.nextInt(3);
        }
        boolean hasZero = hasZeroNeighbors(nums1);

        System.out.println(" ");
        System.out.println("Задача №3");
        System.out.println("переданном массиве" );
                printing.print_array(nums1);

        System.out.println( " есть два соседних элемента, с нулевым значением: " + hasZero);
    }}