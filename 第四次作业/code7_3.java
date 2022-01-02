package 第四次作业;

import java.util.Scanner;

public class code7_3 {
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the intergers between 1 and 100: ");
        int[] num = new int[100];
        int x = input.nextInt();
        while (x != 0) {
            num[x]++;
            x = input.nextInt();
        }
        for (int i = 1; i <= 100; i++) {
            if (num[i] == 1) {
                System.out.printf("%d occurs 1 time\n", i);
            } else if (num[i] > 1) {
                System.out.printf("%d occurs %d times\n", i, num[i]);
            }
        }
    }
}
