package LinearSearchAlgorithm;

public class LinearSearchAlgorithm {
    /**
     * * Linear search algorithm says start searching from
     * * First element till you find the element you're looking for.
     */
    public static void main(String[] args) {

        int[] nums = {1, 2, 18, 20, -19, 10, -1, 89, 78};
        int target = 789;
        int result = linearSearch(nums, target);
        int ans = linearSearchAlgo(nums, target);
        System.out.println("Index is : " + result);
        System.out.println("Element is: " + ans);

    }

    // todo: Search in the array-> rerun the index if item found
    public static int linearSearch(int[] arr, int target) {

        //* check if element is in array
        if (arr.length == 0) {
            return -1; //! if element not found in the array it returns -1
        }

        //* run for loop
        for (int index = 0; index < arr.length; index++) {

            //* check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //* this line will execute if none of the return statements above have executed
        //* Not taking -1 as return because element in array also be -1, so we use Integer.MAX_VALUE
        return Integer.MAX_VALUE; //! hence, target not found
    }

    // todo: Search the target and return the element
    public static int linearSearchAlgo(int[] arr, int target) {

        //* check if element is in array
        if (arr.length == 0) {
            return -1; //! if element not found in the array it returns -1
        }

        //* run for loop
        for (int element : arr) {
            //* check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }

        //* this line will execute if none of the return statements above have executed
        //* Not taking -1 as return because element in array also be -1, so we use Integer.MAX_VALUE
        return Integer.MAX_VALUE; //!  hence, target not found
    }

    // todo: Search the target and return True if element found otherwise False
    public static boolean linearSearchAl(int[] arr, int target) {

        //* check if element is in array
        if (arr.length == 0) {
            return false; //! array not found return false
        }
        //* run for loop
        for (int element : arr) {
            //* check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }

        //* this line will execute if none of the return statements above have executed
        return false; //!  hence, target not found return false
    }


}




