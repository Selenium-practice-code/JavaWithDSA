package BinarySearchAlgorithm;

//? Find position element in sorted array infinite numbers

public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(positionElement(arr, target));
    }

    public static int positionElement(int[] arr, int target) {

        //todo: First find the range
        //* first start the with a box of size 2
        int startIndex = 0;
        int endIndex = 1;

        //* Condition for the target to lie in the range
        while (target > arr[endIndex]) {

            int newStartIndex = endIndex + 1; //! this is my new Start

            //* double the size of the box
            //* endIndex = previous endIndex + sizeofthebox * 2
            endIndex = endIndex + (endIndex - startIndex + 1) * 2;

            //* updating the startIndex
            startIndex = newStartIndex;
        }

        return binarySearch(arr, target, startIndex, endIndex);
    }

    public static int binarySearch(int[] arr, int target, int startIndex, int endIndex) {

        //* check startIndex is less than equal to endIndex
        while (startIndex <= endIndex) {

            //* Find the Middle value
            int mid = startIndex + (endIndex - startIndex) / 2;

            //* check if target value is less than middle value than decrease 1 form mid
            if (target < arr[mid]) {
                endIndex = mid - 1;
                //* check if target is greater than middle value than increase 1 form mid
            } else if (target > arr[mid]) {
                startIndex = mid + 1;

                //* target == mid than found ans
            } else
                return mid;
        }
        return -1; //! if target value not found in array return -1
    }
}
