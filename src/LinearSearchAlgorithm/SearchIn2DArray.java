package LinearSearchAlgorithm;


import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {

                {12, 27, 18, 89},
                {1, 8, 100},
                {2, 9},
                {22, 78, 101, 78, 99}
        };

        int target = 9900;
        int[] targetIndex = search(arr, target); //* format of the return index {row, col}
        System.out.println(Arrays.toString(targetIndex));

    }

    //todo: Search the target index in 2D array
    public static int[] search(int[][] arr, int target) {

        //* check if array is empty or not
        if (arr.length == 0) {
            return new int[]{-1}; //! if 2D array empty return -1

        }

        //* iterate from every Row and Column
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //* every col of each row

                //* check if every row and col equals to target
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }

            }
        }
        return new int[]{-1, -1}; //! if values not found in 2D array return {-1, -1}
    }
}
