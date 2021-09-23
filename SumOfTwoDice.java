import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int sides = 6;
        //Gives the random roll to one die
        int a = (int) (1 + (Math.random() * sides));
        //Gives the random roll to the second die
        int b = 1 + (int) (Math.random() * sides);
        //Adds the sum of the two dice
        int sum = a + b;
        System.out.println(sum);
    }
}
