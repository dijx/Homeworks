package Week3;

import com.sun.jdi.InternalException;

import java.io.NotActiveException;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class FindOddCubes {

    public static int cubeOdd(int arr[]) {

        return Arrays.stream(arr)
                .map(a -> (int)Math.pow(a, 3))
                .filter(a -> a%2 != 0)
                .reduce((a,b) -> a+b)
                .orElse(0);

    }

    public static void main(String[] args) {
        int [] test = {-3, -2, 2, 3};

        System.out.println(cubeOdd(test));

    }

}