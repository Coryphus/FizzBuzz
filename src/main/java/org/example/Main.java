package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] fizzBuzz(int max) {
        String[] ans = new String[max];

        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans[i-1]= "FizzBuzz";
            } else if (i % 3 == 0) {
                ans[i-1]= "Fizz";
            } else if (i % 5 == 0) {
                ans[i-1]= "Buzz";
            } else {
                ans[i-1] = Integer.toString(i);
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a maximum");
        int max = scanner.nextInt();

        String[] ans = Main.fizzBuzz(max);

        System.out.println(Arrays.toString(ans));
        scanner.close();
    }
}