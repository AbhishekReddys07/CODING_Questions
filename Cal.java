package inte;

import java.util.Arrays;

public class Cal {

    public static int[] getChange(double x, double y) {
        int[] coins = new int[6]; // Array to store the number of each coin
        double change = x - y; // Calculate the change to be returned

        // Convert change to paise
        int changeInPaise = (int) (change * 100);

        // Array of coin values in paise
        int[] coinValues = {100, 50, 25, 10, 5, 1};

        // Loop through coin values and calculate the number of each coin
        for (int i = 0; i < coinValues.length; i++) {
        	 coins[i] = changeInPaise / coinValues[i]; // Calculate the number of coins
            changeInPaise = changeInPaise % coinValues[i]; // Calculate the remaining change
        }

        return coins;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getChange(5, 0.99))); // [1, 0, 0, 0, 0, 4]
        System.out.println(Arrays.toString(getChange(3.14, 1.99))); // [0, 1, 1, 0, 0, 1]
        System.out.println(Arrays.toString(getChange(4, 3.14))); // [1, 0, 1, 1, 1, 0]
        System.out.println(Arrays.toString(getChange(0.45, 0.34))); // [1, 0, 1, 0, 0, 0]
    }
}

