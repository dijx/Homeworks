package Week3;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.sort;

public class Pendulum {

    public static int[] pendulum(final int[] values) {

        Arrays.sort(values);
        String temp = new String();
        for (int i = 0; i < values.length; i++) {
            temp = (i % 2 != 0 || i < 2) ? temp + Integer.toString(values[i]) + "," : Integer.toString(values[i]) + "," + temp;
        }
        return Arrays.stream(temp.split(",")).mapToInt(a -> Integer.parseInt(a)).toArray();
    }

    public static void main(String[] args) {

        int[] test = {8, 3, 7, 10, 3, 4, 9};
        System.out.println(Arrays.toString(pendulum(test)).toString());
    }
}
