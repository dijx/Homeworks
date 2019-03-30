package Week2;
import java.util.Arrays;
import java.util.Collections;

public class CountClosestToZero {

    public static void main(String[] args) {

        int [] testArray = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3,3,3};

        System.out.println(mostFrequentItemCount(testArray));
    }

        public static int mostFrequentItemCount(int[] collection) {
            if (collection.length==0 || collection ==null)
                return 0;

            Arrays.sort(collection);
            System.out.println(Arrays.toString(collection));

            int frequentCount = 0;
            int frequentValue = 0;
            int tempCount=1;

            for (int i = 0; i < collection.length-1; i++) {
                int t1=collection[i];
                int t2=collection[i+1];
                if (t1==t2) {
                    tempCount++;
                    if (tempCount > frequentCount) {
                        frequentCount = tempCount;
                    }
                } else {
                    tempCount = 1;
                }
            }
            return frequentCount;
        }
}
