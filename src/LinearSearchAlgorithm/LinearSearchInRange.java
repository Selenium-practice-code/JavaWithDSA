package LinearSearchAlgorithm;

public class LinearSearchInRange {

    public static void main(String[] args) {

        //? Search for the target element in the range of given Index
        int[] nums = {1, 2, 18, 20, -19, 10, 12, 89, 78};
        int target = 89;
        int startIndex = 6;
        int endIndex = 8;
        System.out.println("Index is : " + linearSearchInRange(nums, target, startIndex, endIndex));

    }

    // todo: Search the target form given range and return the element
    public static int linearSearchInRange(int[] arr, int target, int startIndex, int endIndex) {

        //* check if element is in array
        if (arr.length == 0) {
            return -1; //! if element not found in the array
        }

        //* run for loop from index start till end
        for (int index = startIndex; index <= endIndex; index++) {

            //* check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //* this line will execute if none of the return statements above have executed
        return -1; //!  hence, target not found
    }

}
