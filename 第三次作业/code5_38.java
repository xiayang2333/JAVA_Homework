package 第三次作业;

import java.util.Scanner;

public class code5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal numeral: ");
        int num = input.nextInt();
        int[] digits = new int[65];
        int tot = 0;
        while (num > 0) {
            digits[++tot] = num % 8;
            num /= 8;
        }
        for (int i = tot; i >= 1; i--) {
            System.out.print(digits[i]);
        }
    }

}
