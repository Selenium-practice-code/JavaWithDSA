package BinarySearchAlgorithm;

//? Find the smallest latter greater than target
//*Note: latter is also wrap around means target not found return index[0] in array
public class NextGreatestNumber {

    public static void main(String[] args) {

        char[] latter = {'c', 'd', 'f'};
        char target = 'd';
        char ans = nextGreatestNumber(latter, target);
        System.out.println(ans);
    }

    public static char nextGreatestNumber(char[] latter, char target) {

        int startIndex = 0;
        int endIndex = latter.length - 1;

        //* while start is less than equal to end
        while (startIndex <= endIndex) {

            //*find the middle element
            //! int midElement = (startIndex + endIndex) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = startIndex + (endIndex - startIndex) / 2;

            //* check target if less than mid
            if (target < latter[mid]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return latter[startIndex % latter.length]; //! target found
    }
}
