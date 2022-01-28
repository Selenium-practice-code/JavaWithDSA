package BinarySearchAlgorithm;

/**
 * For ASC order
 * 1.Binary search is : Find the middle element in the array
 * 2. if target element is > middle element ==> Search Right side of array(s=m+1)
 * 3. if target element is < middle element ==> Search left side of array(e=m-1)
 * 4. if target element is == to middle element, my element is found.
 * Note: if start index value  > end index value means element not found in array
 */
public class BinarySearch {

    public static void main(String[] args) {

        //? Return the Index of the target element
        // Array is sorted in Ascending order
        int[] arr = {-12, -11, -4, 0, 2, 3, 4, 15, 16, 18, 36, 89, 90};
        int target = 36;
        int fIndex = binarySearch(arr, target);
        System.out.println("Index is:" + fIndex);
    }

    public static int binarySearch(int[] arr, int target) {

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
                //* target element is found (target == mid)
                return mid;
            }
        }
        return -1; //! element does not exit in the array return -1
    }
}
