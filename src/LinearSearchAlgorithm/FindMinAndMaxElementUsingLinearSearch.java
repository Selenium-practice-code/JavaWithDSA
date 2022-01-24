package LinearSearchAlgorithm;

public class FindMinAndMaxElementUsingLinearSearch {

    /**
     * * Linear search algorithm says start searching from
     * * First element till you find the element you're looking for.
     */

    public static void main(String[] args) {

        //? Find the Min value is present in the array.
        int[] arr = {23, 5, 6, 8, 10, 68};
        System.out.print("Min Value in the array is: " + minValue(arr));
        System.out.print("Max Value in the array is: " + minValue(arr));
    }

    // Todo: Method for finding min value in array
    public static int minValue(int[] arr) {

        //* check if array is empty ot not
        if (arr.length == 0) {
            return -1; //! if element not found in the array it returns -1
        }

        int minV = arr[0];

        //* iterate array form index 1
        for (int index = 1; index < arr.length; index++) {

            //* check if current value is less than overall minV than update the minV
            if (arr[index] < minV) {
                minV = arr[index];
            }

        }
        //* rerun the min value in the array
        return minV;

    }

    // Todo: Method for finding max value in array
    public static int maxValue(int[] arr) {

        //* check if array is empty ot not
        if (arr.length == 0) {
            return -1; //! if element not found in the array it returns -1
        }

        int maxV = arr[0];

        //* iterate array form index 1
        for (int index = 1; index < arr.length; index++) {

            //* check if current value is less than overall minV than update the minV
            if (arr[index] > maxV) {
                maxV = arr[index];
            }

        }
        //* rerun the min value in the array
        return maxV;

    }
}
