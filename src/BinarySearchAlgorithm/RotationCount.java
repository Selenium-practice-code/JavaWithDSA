package BinarySearchAlgorithm;

//? find the rotation count in Rotated sorted array

public class RotationCount {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2}; // 4
//        //* using not rotated array
//        int[] arr = {1, 2, 3, 4, 5, 6}; // 0
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] arr) {

        //* first find pivot
        int pivot = findPivot(arr);

        //* return the rotation of the array
        return pivot + 1; //! if array not rotated it returns 0 (-1 + 1 )
    }

    //* use this for non-duplicate
    public static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        //* while start is less than equal to end
        while (start <= end) {

            //* find middle element
            int mid = start + (end - start) / 2;

            //* case 1: if my middle element is greater than the next element
            //* make sure it is not exceeding outside the range
            //* suppose mid is equal to last index of the array then check for arr[mid + 1] means last index+ 1
            //* it gives error IndexOutOfBond Exception
            //* so mid is always be less than end when make this check
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            //* case 2: if my middle element is less than previous one
            //* make sure it is not exceeding outside the range
            //* so mid is always be greater than end when make this check
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //* case3: All element from mid <= start hence, we can ignore all these
            //* elements since we are looking for peak i.e. the largest element
            if (arr[mid] <= start) {
                end = mid - 1;

            } else {
                //* case 4: if this way pivot, it would've been return in case 1 & 2
                //* Hence proved, that bigger number lie ahead.
                //* Hence, ignore mid & put
                start = mid + 1;
            }
        }

        return -1; //! element not found
    }

    //* use this method with duplicate elements
    public static int findPivotWithDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        //* condition while start is less equal to end
        while (start <= end) {

            //* Find the middle element
            int mid = start + (end - start) / 2;


            //* case 1: if my middle element is greater than the next element
            //* make sure it is not exceeding outside the range
            //* suppose mid is equal to last index of the array then check for arr[mid + 1] means last index+ 1
            //* it gives error IndexOutOfBond Exception
            //* so mid is always be less than end when make this check
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            //* case 2: if my middle element is less than previous one
            //* make sure it is not exceeding outside the range
            //* so mid is always be greater than end when make this check
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //* If elements at start, middle, end equal then just skips the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                //! What if these elements at start and end were the pivots ?
                //* check if start is pivot then return pivot otherwise skip
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                //* skip the duplicate
                start++;

                //* check whether end is pivot then return pivot otherwise skip
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                //* skip the duplicate
                end--;
            }

            //* left side is sorted, so pivot should be right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; //! element not found
    }
}

