package LinearSearchAlgorithm;

public class LinearSearchInString {
    /**
     * * Linear search algorithm says start searching from
     * * First element till you find the element you're looking for.
     */
    public static void main(String[] args) {

        //? Find the target element is present if the given String or not.
        String name = "Ironman";
        char target = 'm';
        System.out.println(linearSearchString(name, target));
    }

    // todo: Search target in the array string if found reruns True otherwise False
    public static boolean linearSearchString(String str, char target) {

        //* check if character in String or not
        if (str.length() == 0) {
            return false; //! If String not found return false
        }

        //* run for loop
        for (int i = 0; i < str.length(); i++) {

            //* Convert the String int Char using CharAt() and check the equal to target
            if (target == str.toLowerCase().charAt(i)) {
                return true;
            }
        }
        //* this line will execute if none of the return statements above have executed
        return false; //!  hence, target not found return false
    }
}
