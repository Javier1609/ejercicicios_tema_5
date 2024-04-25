package ejercicio_1;

import java.util.Scanner;

public class ejercicio_1 {
    public static int sumOfNaturalNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = scanner.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}