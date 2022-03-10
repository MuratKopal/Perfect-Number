package Donguler;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num = scan.nextInt();

        int total = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if(total/2 == num) {
            System.out.println(num + " mükemmel sayıdır.");
        } else {
            System.out.println(num + " mükemmel sayı değildir.");
        }
    }
}
