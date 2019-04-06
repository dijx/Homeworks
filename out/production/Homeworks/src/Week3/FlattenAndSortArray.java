/*
Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

Example:
Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].

*/

package Week3;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlattenAndSortArray {

    public static int[] flattenAndSort(int[][] array) {

        return Stream.of(array)
                .flatMapToInt(r -> IntStream.of(r))
                .sorted()
                .toArray();
    }


    public static void main(String[] args) {
        int [][] test =new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}};

        System.out.println(flattenAndSort(test));

    }
}
