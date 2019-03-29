package Week2;

import java.util.Arrays;
import java.util.Collections;

public class TailHeadBody {

    public static void main(String[] args) {

        String [] testArray = { "heads", "body", "tails" };
        String [] fixedArray = fixTheMeerkat(testArray);
        System.out.println(Arrays.toString(fixedArray));
    }


    static String[] fixTheMeerkat(String[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }

}
