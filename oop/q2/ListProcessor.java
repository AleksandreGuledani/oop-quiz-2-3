package oop.q2;

import java.util.ArrayList;
import java.util.List;

/**
 * ListProcessor is a simple Java program that demonstrates
 * how to create a third list (list3) based on two predefined lists:
 * 
 * <ul>
 * <li>list1: a list of integers</li>
 * <li>list2: a list of strings</li>
 * </ul>
 * 
 * For each integer x in list1, list3 contains the element from list2 
 * at index (x * 2) - 1.
 * 
 * If the calculated index is out of bounds for list2, the string
 * "IndexOutOfBounds" is added instead.
 * 
 * The program prints the resulting list3 to the console.
 * 
 * Example output:
 * OwY, Me9W, lpuZ, OwY, SZ3, Ugs, Ugs, OwY, OwY, Wh8x, uGr4, Wh8x, OwY
 * 
 * @author Aleksandre Guledani
 * 
 */

public class ListProcessor {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        // Adding elements to list1
        list1.add(9);
        list1.add(7);
        list1.add(5);
        list1.add(9);
        list1.add(8);
        list1.add(3);
        list1.add(3);
        list1.add(9);
        list1.add(9);
        list1.add(6);
        list1.add(4);
        list1.add(6);
        list1.add(9);

        // Adding elements to list2
        list2.add("UEIG4");
        list2.add("wQgx");
        list2.add("13rw");
        list2.add("Ojg");
        list2.add("Fqmw");
        list2.add("Ugs");
        list2.add("JjinI");
        list2.add("uGr4");
        list2.add("tXu");
        list2.add("lpuZ");
        list2.add("M4s9Q");
        list2.add("Wh8x");
        list2.add("0Q9c");
        list2.add("Me9W");
        list2.add("q9iI0");
        list2.add("SZ3");
        list2.add("kGp");
        list2.add("OwY");

        // Creating list3 based on the rule
        for (int x : list1) {
            int idx = (x * 2) - 1;  // calculate index for list2
            if (idx >= 0 && idx < list2.size()) {
                list3.add(list2.get(idx));
            } else {
                list3.add("IndexOutOfBounds"); // or handle error
            }
        }

        // Print list3 elements
        System.out.println(String.join(", ", list3));
    }
}
