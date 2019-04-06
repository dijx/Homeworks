package Week3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Minimum{

    public static int minValue(int[] values){


        return Integer.parseInt(
            (Arrays.stream(values)
                    .distinct()
                    .sorted()
                    .mapToObj(Integer::toString)
                    .collect(Collectors.joining())
            )
        );
    }

    public static void main(String[] args) {

        int [] test = new int[] {6, 7, 8, 7, 6, 6};

        System.out.println(minValue(test));

    }


}