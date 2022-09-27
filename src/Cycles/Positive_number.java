package Cycles;

import java.util.Scanner;

public class Positive_number {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

