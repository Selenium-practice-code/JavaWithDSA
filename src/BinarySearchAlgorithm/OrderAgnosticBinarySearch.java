package BinarySearchAlgorithm;

/**
 * OrderAgnosticBinarySearch : means it works for both ASC and Dec order
 * first it will check is array is ASC or DEC
 */
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        //int[] arr = {-12, -11, -4, 0, 2, 3, 4, 15, 16, 18, 36, 89, 90}; // Asc order array
        int[] arr = {99, 89, 67, 29, 1, -2,}; // dec order

        int target = 1;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    public static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        //* Find the array is sorted in ascending or descending order
        //* if array is Asc  return true otherwise false
        boolean isAsc = arr[start] < arr[end];

        //* while start is less than equal to end
        while (start <= end) {

            //*find the middle element
            //! int midElement = (startIndex + endIndex) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            //* check for both ascending and descending
            if (arr[mid] == target) {
                return mid;
            }
            //*  check if array in ascending order do this
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

                //* array in descending order do this
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; //! element does not exit in the array return -1
    }
}

