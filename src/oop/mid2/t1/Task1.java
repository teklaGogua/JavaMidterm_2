package oop.mid2.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This program processes two lists (list1 and list2) with predefined values.
 * 
 * Operations performed:
 * - Creates and initializes list1 (integers) and list2 (strings)
 * - Creates list3 by using values from list1 to calculate indices for list2
 *   using the formula: index = integer + (integer - 1) = 2n - 1
 * - Handles index out-of-bounds cases gracefully by skipping invalid indices
 * - Removes elements at even indexes from list3
 */
public class Task1 {
    public static void main(String[] args) {
        // Initialize list1 with integer values
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 2, 3, 9, 2, 3, 8, 5, 3, 5, 2, 3, 6));
        System.out.println("list1 (integers): " + list1);

        // Initialize list2 with string values
        List<String> list2 = new ArrayList<>(Arrays.asList(
            "2tpA", "9N60w", "DFw", "mO9g6", "P2WD", "6DRX2", "RTVOb", "RHOY", "Ct2", "KRbtu", "Ym5Yu", "MW9", "5PPzD", "kem1C", "hmWJ", "9XTEQ", "12x", "Qzo8"
        ));
        System.out.println("list2 (strings): " + list2);

        // Create list3 using values from list1 to index into list2
        List<String> list3 = createList3(list1, list2);
        System.out.println("list3 (before removing odd indexes): " + list3);

        // Remove elements at even indexes from list3
        removeEvenIndexElements(list3);
        System.out.println("list3 (after removing even indexes): " + list3);
    }

    /**
     * Creates a new list (list3) by using values from list1 to calculate
     * indices into list2 using the formula: index = num + (num - 1).
     * If the calculated index is out of bounds, it is skipped.
     *
     * @param integers List of integers used to compute indices
     * @param strings List of strings to index into
     * @return A list of strings from list2 selected by computed indices
     */
    private static List<String> createList3(List<Integer> integers, List<String> strings) {
        List<String> result = new ArrayList<>();

        for (Integer num : integers) {
            // Calculate index: num + (num - 1)
            int calculatedIndex = num + (num - 1);

            // Check bounds
            if (calculatedIndex >= 0 && calculatedIndex < strings.size()) {
                result.add(strings.get(calculatedIndex));
            } else {
                System.out.println("Warning: Calculated index " + calculatedIndex + 
                                   " is out of bounds for list2 (size: " + strings.size() + ")");
            }
        }

        return result;
    }

    /**
     * Removes elements at odd indexes (1, 3, 5, ...) from the given list.
     * Modifies the list in-place.
     *
     * @param list The list from which to remove elements
     */
    private static void removeEvenIndexElements(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
