package 第三次作业;

import java.util.Scanner;

public class code5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 number: ");
        double sum = 0;
        double sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            double num;
            num = input.nextDouble();
            sum += num;
            sum2 += num * num;
        }
        System.out.printf("The mean is %.2f\n", sum / 10);
        System.out.printf("The standard devition is %f\n", Math.sqrt((sum2 - (sum * sum / 10.0)) / 9.0));
    }
}
