package BinarySearchAlgorithm;

/**
 * Floor Number in array is :-(the largest element in array smaller than or equal to target) smaller no <= target number
 */
public class FloorNumber {

    public static void main(String[] args) {


        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }

    public static int floorNumber(int[] arr, int target) {


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
        return endIndex; //! element does not exit in the array return end
    }
}
