package 第二次作业;

import java.util.*;

public class SalesTax {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $ " + (int) (tax * 100) / 100.0);
    }
}
