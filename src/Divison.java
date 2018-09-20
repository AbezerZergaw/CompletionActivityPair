import java.util.Scanner;

public class Divison {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*double num;
        double userInPut;
        System.out.println("Enter a number:");
        userInPut = input.nextDouble();
        double value =
        num = input.nextDouble();
        double outPut = diviedNum(num);

        System.out.println(outPut);

        System.out.println("Check number");
        */
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println(checkNum(number));
        System.out.println(diviedNum(number));

    }

    public static double diviedNum(double number) {
        double total = number / 3;
        ;
        // Scanner input = new Scanner(System.in);


        return total;

    }

    public static String checkNum(int num) {

        String sentence = "";


        if (num > 3) {
            sentence = "The number is greater than 3";
        }
        if (num < 3) {
            sentence = "The number is less than 3";
        }
        if (num == 3) {
            sentence = "The number is equal to 3";



        } return sentence;

    }
}

