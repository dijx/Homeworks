package Week1;

public class CountAndSum {

    public static void main(String[] args) {

        int[] expectedResult = new int[] {10, -65};
        System.out.println(countPositivesSumNegatives(expectedResult)[0]);
        System.out.println(countPositivesSumNegatives(expectedResult)[1]);
    }

        public static int[] countPositivesSumNegatives(int[] input) {


            int positiveCount = 0;
            int negativeSum = 0;
        if (input != null && input.length != 0) {

            int[] result = new int[2];
            for (int i = 0; i < input.length; i++) {
                if (input[i] < 0) {
                    negativeSum += input[i];
                }
                if (input[i] > 0) {
                    positiveCount++;
                }
            }
            result[0] = positiveCount;
            result[1] = negativeSum;
            return result;

        } else {
            int[] result = new int[0];
            return result;
        }

    }
}
