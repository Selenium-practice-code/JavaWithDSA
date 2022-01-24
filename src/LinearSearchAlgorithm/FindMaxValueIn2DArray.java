package LinearSearchAlgorithm;

public class FindMaxValueIn2DArray {

    public static void main(String[] args) {

        //? Find the max value in given 2D array
        int[][] arr = {

                {12, 27, 18, 89},
                {1, 8, 100},
                {2, 9},
                {22, 78, 101, 78, 99}
        };

        System.out.println(maxValue(arr));
    }

    /**
     * todo Method for Finding maxValue in array
     * * @return maxV in array
     */
    public static int maxValue(int[][] arr) {

        //* check if array is empty or not
        if (arr.length == 0) {
            return -1; //! if 2D array empty return -1
        }

        int maxV = Integer.MIN_VALUE; //* MIN_VALUE(-2127483648) -> integer can hold

        //* using enhanced for loop for traversing in array
        for (int[] a : arr) {
            for (int element : a) {

                //* if element greater than maxV
                if (element > maxV) {
                    maxV = element;
                }

            }
        }
        return maxV;

    }
}
