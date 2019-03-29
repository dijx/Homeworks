package Week1;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(1238789));
    }

    public static int sortDesc(final int num) {

        int result = 0;
        Integer num2 = num;
        String preResult = new String();
        char[] numArr = num2.toString().toCharArray();
        Arrays.sort(numArr);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = numArr.length - 1; i >= 0; i--) {
            preResult += numArr[i];
        }
        result = Integer.parseInt(preResult);
        return result;
    }


}
