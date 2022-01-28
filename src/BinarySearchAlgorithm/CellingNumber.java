package BinarySearchAlgorithm;

/**
 * Celling Number in array is :-(the largest element in array greater than or equal to target) greater number >= target number
 */
public class CellingNumber {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = cellingNumber(arr, target);
        System.out.println(ans);
    }

    public static int cellingNumber(int[] arr, int target) {

        //* What if the target number is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1; //! not exit return -1
        }
        int startIndex = 0;
        int endIndex = arr.length - 1;

        //* while start is less than equal to end
        while (startIndex <= endIndex) {

            //*find the middle element
            //! int midElement = (startIndex + endIndex) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = startIndex + (endIndex - startIndex) / 2;

            //* check target if less than mid
            if (target < arr[mid]) {
                endIndex = mid - 1;

            } else if (target > arr[mid]) {
                startIndex = mid + 1;
            } else {
                //* target element is found
                return mid;
            }
        }
        return startIndex; //! element does not exit in the array return start
    }
}
