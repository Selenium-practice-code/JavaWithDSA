package LinearSearchAlgorithm;

//? Find numbers with even number of digits

public class FindEvenDigits {

    public static void main(String[] args) {

        int[] nums = {12, 9, 123, 1567, 15679};

        System.out.println(findNumbers(nums)); // 2
        System.out.println(digits(-12345)); // 5
        System.out.println(digits(0)); // 1
        System.out.println(shortcutToCountDigits(3456)); // 4

    }

    //* Method for Finding Numbers
    public static int findNumbers(int[] nums) {

        int count = 0;

        //* iterate array using enhanced for loop
        //* For every number in numbers
        for (int num : nums) {

            //* check even num to call even method and increase the count
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    //* Method to check whether a number is even number or not
    private static boolean even(int num) {
        /*
          todo Rule1 -> Count the number of digits
          todo Rule2 -> Convert number in to String, take the length
         */

        //* calling the digit method
        int numberOfDigits = digits(num);

        //* check if number of digits if even or not
        return numberOfDigits % 2 == 0; //! if number even return True otherwise False

    }

    //* Method to count number of digits in numbers
    private static int digits(int num) {

        //* if number is negative make it positive
        if (num < 0) {
            num *= -1; // num = num * -1
        }

        //* if number is 0 return 1 because zero contains one digit
        if (num == 0) {
            return 1;
        }

        int count = 0;

        //* while my number is grater than zero increase the count
        while (num > 0) {
            count++;
            num /= 10; // num = num 10
        }

        return count;
    }

    //* shortcut method to count a digits
    private static int shortcutToCountDigits(int num) {

        //* if number is negative make it positive
        if (num < 0) {
            num *= -1; // num = num * -1
        }

        return (int) (Math.log10(num) + 1);
    }


}
