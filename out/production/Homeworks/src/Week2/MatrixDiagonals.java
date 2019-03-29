/*
Principal Diagonal -- The principal diagonal in a matrix identifies those elements of the matrix running from North-West to South-East.

Secondary Diagonal -- the secondary diagonal of amatrix identifies those elements of the matrix running from North-East to South-West.

For example:

matrix:             [1, 2, 3]
                    [4, 5, 6]
                    [7, 8, 9]

principal diagonal: [1, 5, 9]
secondary diagonal: [3, 5, 7]
Task
Your task is to find which diagonal is "larger": which diagonal has a bigger sum of their elements.

If the principal diagonal is larger, return "Principal Diagonal win!"
If the secondary diagonal is larger, return "Secondary Diagonal win!"
If they are equal, return "Draw!"
Note: You will always receive matrices of the same dimension.


 */

package Week2;

public class MatrixDiagonals {


    public static void main(String[] args) {

        int[][] test1= {{1,2,3},
                        {4,5,6},
                        {1,8,9} };

        //System.out.println((test1[1][2]));

        System.out.println(diagonal(test1));

    }


    public static String diagonal(int[][] matrix){
        
        int principal = 0;
        int secondary = 0;

        for (int i = 0; i < matrix.length; i++) {
            principal+=matrix[i][i];
        }

        System.out.println(principal);


        for (int i = 0; i < matrix.length; i++) {
            secondary+=matrix[matrix.length-i-1][i];
        }

        System.out.println(secondary);

        if (principal==secondary)
            return "Draw!";

        if (principal > secondary) {

            return "Principal Diagonal win!";

        } else if (secondary > principal ) {
            return "Secondary Diagonal win!";
        } else {
            return "Draw!";
        }
    }
}
