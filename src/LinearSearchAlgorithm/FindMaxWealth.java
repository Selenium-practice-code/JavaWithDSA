package LinearSearchAlgorithm;

//? Find the richest customer wealth

public class FindMaxWealth {

    public static void main(String[] args) {

        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {

        int wealth = Integer.MIN_VALUE;
        //* iterating from each person account
        for (int[] acc : accounts) {

            //* when you start a new column, take a sum for that row
            int sum = 0;
            for (int ac : acc) {
                sum += ac;
            }

            //* now we have sum of the accounts of the person
            //* check with overall wealthy
            if (sum > wealth) {
                wealth = sum;
            }
        }
        return wealth;
    }
}
