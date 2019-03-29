package Week2;

import java.util.Arrays;
import java.util.Collections;

public class MatrixSum {


    public static int sumOfElements(int matrix[][]) {
        int result=0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                result+=anInt;
            }
        }
        return result;
    }

}
