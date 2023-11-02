// Rakamların faktöriyelini bulan program

import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; //fact = fact * i
        }
        System.out.println(n + "! = " + fact);
    }
}

