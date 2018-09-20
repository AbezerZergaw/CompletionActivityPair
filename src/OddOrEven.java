import java.util.Scanner;

public class OddOrEven {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println(checkNum(number));
    }

    public static int checkNum(int num1) {


        if (num1 % 2 == 0) {
            System.out.println("You entered even number");
        } else
            System.out.println("You entered odd number");

        return num1;
    }

}
