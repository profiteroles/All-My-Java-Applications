package totalaverage;

import java.util.Scanner;

public class TotalAverage {

    public static void main(String[] args) {

        Scanner total = new Scanner(System.in);

        System.out.println("Enter your First number and enter, than second press enter and your last number following by enter");

        int num1 = total.nextInt();
        int num2 = total.nextInt();
        int num3 = total.nextInt();
        double average = ((num1 + num2 + num3) / 3.0);
        // Output input by user
        System.out.println("Your first number is : " + num1);
        System.out.println("Your second number is : " + num2);
        System.out.println("Your third number is : " + num3);
        System.out.println("Your total is : " + (num1 + num2 + num3));
        System.out.println("The total average is : " + average);

    }

}
/**
 *
 * @author 30023737
 */
