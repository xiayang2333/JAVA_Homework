package 第四次作业;

import java.util.Scanner;

public class code7_5 {
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("ENter 10 numbers: ");
        int[] num = new int[20];
        int[] vis = new int[100010];
        int tot = 0;
        for (int i = 1; i <= 10; i++) {
            int x = input.nextInt();
            if (vis[x] == 0) {
                vis[x] = 1;
                num[++tot] = x;
            }
        }
        System.out.printf("The number of distinct numbers is %d\n", tot);
        System.out.print("The distinct numbers are: ");
        for (int i = 1; i <= tot; i++) {
            System.out.print(num[i] + " ");
        }
    }
}