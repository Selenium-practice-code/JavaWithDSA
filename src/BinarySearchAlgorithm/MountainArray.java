package BinarySearchAlgorithm;

//? Find the peak index in mountain array

public class MountainArray {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        //* check while start is less than end
        while (startIndex < endIndex) {

            //* Then find the middle element
            int mid = startIndex + (endIndex - startIndex) / 2;

            //* if middle is greater than mid + 1
            if (arr[mid] > arr[mid + 1]) {

                //* you are in decreasing part of the array
                //* this may be the ans, but look at left side of array
                endIndex = mid; //! this is my end != mid -1

            } else {
                //* you are in ASC part of the array
                startIndex = mid + 1; //! because ypu know that mid + 1 element > middle element
            }
        }

        //* In the end, startIndex = endIndex and pointing to the largest number because of two checks above
        //* startIndex and endIndex always find the max element in the above two checks
        //* Hence, when they are pointing to just one element, that is maximum one because that is checks say
        //* At every point of the time for startIndex and endIndex, they have the best possible answer till that time
        //* If we are saying that only one item is remaining, hence because of above line that is the best possible answer

        return startIndex; //! Or return endIndex both are equal
    }
}
