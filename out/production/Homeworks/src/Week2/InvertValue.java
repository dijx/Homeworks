/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
 */

package Week2;

public class InvertValue {

    public static void main(String[] args) {

        int[] testArray= {1,2,3,-4,-5};

        int []newArray=(invert(testArray));

        for (int i : newArray) {
            System.out.println(i);
        }

    }


    static int[] invert(int[] array) {

        for (int i = 0; i <array.length ; i++)
            array[i]=array[i]*-1;
        return array;
    }
}
