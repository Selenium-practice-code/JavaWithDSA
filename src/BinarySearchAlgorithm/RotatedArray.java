package BinarySearchAlgorithm;

//? search in rotated sorted array
//* first find the pivot : pivot is the largest number in the array

public class RotatedArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        // int[] arr = {2,2,2,9,2,2};
        int target = 0;

        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int target) {

        //* first find pivot
        int pivot = findPivot(arr);

        //* if you don't find the pivot, it means the array is not rotated
        if (pivot == -1) {

            //todo: just do Binary search because array is not rotated
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        //* if pivot is found, you found 2 ascending sorted array
        if (arr[pivot] == target) {
            return pivot;
        }

        //* if target element is grater than equal to start element
        //* so search space is (start, pivot-1)
        //* why because all number after pivot is smaller than start
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1); //! searching first half of the array
        }

        //* All element from start to till pivot are going to be bigger than target
        //* search space is pivot+1 till end of array
        return binarySearch(arr, target, pivot + 1, arr.length - 1);//! searching second half of the array
    }

    // binary search algo
    public static int binarySearch(int[] arr, int target, int start, int end) {

        //* while start is less than equal to end
        while (start <= end) {

            //*find the middle element
            //! int midElement = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            //* check target if less than mid
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //* target element is found (target == mid)
                return mid;
            }
        }
        return -1; //! element does not exit in the array return -1
    }

    // Method for find the pivot not work for duplicate element
    public static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        //* condition while start is less equal to end
        while (start <= end) {

            //* Find the middle element
            int mid = start + (end - start) / 2;

            //* 4 cases over here
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
            //* suppose mid is equal to last index of the array then check for arr[mid - 1] means last index - 1
            //* it gives error IndexOutOfBond Exception
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

    // this method works with duplicate elements
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
            //* suppose mid is equal to last index of the array then check for arr[mid + 1] means last index+ 1
            //* it gives error IndexOutOfBond Exception
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
