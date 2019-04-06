package Week3;

import javax.print.attribute.standard.MediaSize;
import java.util.Arrays;

public class Averange {


        public static double find_average(int[] inArr){

            return Arrays
                    .stream(inArr)
                    .asDoubleStream()
                    .average()
                    .orElseThrow();
        }

    public static void main(String[] args) {
        int [] test = new int[]{1, 2, 3};

        System.out.println(find_average(test));

    }
}
