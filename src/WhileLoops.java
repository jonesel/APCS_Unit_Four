import java.util.Scanner;

public class WhileLoops {

    /**
     * Usage examples:
     * fromHereToThere(20, 30) -> “20 21 22 23 24 25 26 27 28 29 30”
     * fromHereToThere(30, 20) -> “Invalid input”
     * @param num1 - The starting number
     * @param num2 - The ending number
     * @return A string consisting of either the range of numbers or Invalid Input
     */
    public static String fromHereToThere(int num1, int num2)
    {
int number1=0;
int number2=0;
        if (number1>number2)
        {
            System.out.println("You have entered an invalid number");
        }
        String nums = "";
        while (number1<=number2)
        {
            nums += number1+"";
            number1++;
        }

        return nums; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Use a while loop to allow the user to enter positive or negative integers. The loop will exit
     * when the user enters a 0.
     * @return - A string showing how many positive and negative numbers were entered by the user.
     */
    public static String countPosAndNeg()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive or negative number or 0 to quit: ");
        int number = scan.nextInt();
        int positiveNum=0;
        int negativeNum=0;
        while (number<0||number>0)
        {
            if (number<0)
            {
                negativeNum++;
            }
            else if (number>0)
            {
                positiveNum++;
            }
            System.out.println("Enter a positive or negative number or 0 to quit: ");
             number = scan.nextInt();
        }


        return "There were "+positiveNum+" positive and "+negativeNum+" negative numbers"; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Allow the user to enter 5 whole numbers (can be positive or negative). Keep track
     * of the largest and the smallest.
     * @return A string giving the minimum and maximum. Ex. "The Max value is: 45\nThe Min value is: -87"
     */
    public static String findMinAndMax() {

       return ""; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Calculates all the factors of the given number.
     * @param num A int value greater than 0
     * @return A string of all the factors of the given number separated by a space.
     * Ex. factors(12) returns "The factors of 12 are: 1 2 3 4 6 12 "
     */
    public static String factors(int num) {

        return ""; // update or remove this line. It is only there so the tests do not show an error.
    }


}
