package 第三次作业;

import java.security.Principal;

public class code5_29 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 9 + 1);
        int num2 = (int) (Math.random() * 9 + 1);
        while (num2 == num1) {
            num2 = (int) (Math.random() * 9 + 1);
        }
        System.out.printf("%d%d\n",num1,num2);
    }
}
