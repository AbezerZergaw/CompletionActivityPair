import java.util.Scanner;

public class FuzzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println(fuzzBuzz(number));
    }


    public static String fuzzBuzz(int val) {
        String word ="";

        if((val%3)==0 ){
            word="FizzBuzz";
        }
        if(val%5==0){
            word="Buzz";
        }
        else if(val%3==0 && val%5==0 ){
            word="Fizz";
        }

        return word;
    }
}