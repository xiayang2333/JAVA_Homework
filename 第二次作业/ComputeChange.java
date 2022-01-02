package 第二次作业;

import java.util.*;

public class ComputeChange {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int reaminingAmount = (int) (amount * 100);
        int numberOfOneDollars = reaminingAmount / 100;
        reaminingAmount %= 100;
        int numberOfQuaters = reaminingAmount / 25;
        reaminingAmount %= 25;
        int numberOfDimes = reaminingAmount / 10;
        reaminingAmount %= 10;
        int numberOfNickels = reaminingAmount / 5;
        reaminingAmount %= 5;
        int numberOfPennies = reaminingAmount;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuaters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

    }
}
