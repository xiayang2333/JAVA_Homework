package 第三次作业;

import java.util.Scanner;

public class code3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = (int) (100 + Math.random() * 900);
        // System.out.println(ans);
        int temp = input.nextInt();
        if (temp == ans) {
            System.out.println(10000);
        } else {
            int[] vis = new int[10];
            vis[ans % 10] = 1;
            vis[ans / 100] = 1;
            vis[ans / 10 % 10] = 1;
            int judge = 0;
            if (vis[temp % 10] == 1)
                judge++;
            if (vis[temp / 100] == 1)
                judge++;
            if (vis[temp / 10 % 10] == 1)
                judge++;
            if (judge == 3) {
                System.out.println(3000);
            } else if (judge == 1) {
                System.out.println(1000);
            } else {
                System.out.println(0);
            }
        }
    }
}
