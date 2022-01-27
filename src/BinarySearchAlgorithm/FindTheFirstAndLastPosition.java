package BinarySearchAlgorithm;

import java.util.Arrays;

//? Find the first and last position of element in sorted array
//* if target not found in the array return {-1, -1}
//* run time complicity is o(log n)
public class FindTheFirstAndLastPosition {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 9};
        int target = 8;
        int[] answer = searchRange(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] searchRange(int[] nums, int target) {

        //* Initial answer is
        int[] ans = {-1, -1};

        //* check the first occurrence of the target first
        ans[0] = search(nums, target, true);

        //* if start ans[0] not equal to -1 onliest than check for this
        if (ans[0] != -1) {

            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    //todo: This method returns the index value of target
    public static int search(int[] nums, int target, boolean findFirstIndex) {

        //* potential answer initially is
        int ans = -1;

        int startIndex = 0;
        int endIndex = nums.length - 1;

        //* while startIndex is <= endIndex
        while (startIndex <= endIndex) {

            //* find the middle value
            int mid = startIndex + (endIndex - startIndex) / 2;

            //* check if target is less than middle value than search left side of array
            if (target < nums[mid]) {
                endIndex = mid - 1;

                //* if target is greater than middle value than search right side of array
            } else if (target > nums[mid]) {
                startIndex = mid + 1;

            } else {
                //* my potential answer found
                ans = mid;

                if (findFirstIndex) {
                    endIndex = mid - 1; //! may be the new answer is may lie left-hand side of the start
                } else {
                    startIndex = mid + 1;
                }
            }

        }

        return ans;
    }
}
