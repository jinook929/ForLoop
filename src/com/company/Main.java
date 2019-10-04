package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterests(10000, i)));
        }
        System.out.println("************************");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterests(10000, i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime (i)) {
                count++;
                System.out.println(count + ".");
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("=== Exiting for loop ===");
                    break;
                }
            }
        }
//        System.out.println("1,000 at 2% interest = " + calculateInterests(1000.0, 2.0));
//        System.out.println("1,000 at 3% interest = " + calculateInterests(1000.0, 3.0));
//        System.out.println("1,000 at 4% interest = " + calculateInterests(1000.0, 4.0));
//        System.out.println("1,000 at 5% interest = " + calculateInterests(1000.0, 5.0));
    }

    public static double calculateInterests (double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime (int n) {

        if (n == 1) {
            return false;
        }

        for(int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
