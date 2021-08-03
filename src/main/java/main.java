import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        System.out.print("Enter Num1: ");

            int num1 = sc.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        if(num1<0 || num2 <0){
            System.out.println("Input a positive number");
        }
        else {
            if (num2 == 0) {
                System.out.println("You cannot divide by 0");
                System.out.println("GCD: " + num1);
            } else {


                int r = 1;

                //num1 = num2 * q + r
                while (r > 0) {

                    int q = num1 / num2;
                    r = num1 % num2;
                    int temp = num1;
                    num1 = num2;
                    System.out.println(temp + "=" + num2 + "*" + q + "+" + r);
                    num2 = r;
                }

                System.out.println("GCD: " + num1);


            }
        }
        }catch (InputMismatchException e){
            System.out.println("invalid input, it should be an Integer");
        }
    }
}
