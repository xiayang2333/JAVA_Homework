package 第三次作业;

import java.util.Scanner;

public class code3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        if (num1 + num2 <= num3 || num1 + num3 <= num2 || num2 + num3 <= num1) {
            System.out.println("error");
        } else {
            System.out.println(num1 + num2 + num3);
        }

    }
}
