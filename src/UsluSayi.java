//Girilen sayının üssünü alan program
import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int taban,us ;

        System.out.print("Tabanı Giriniz: ");
        taban = girdi.nextInt();
        System.out.print("Üssü Giriniz: ");
        us = girdi.nextInt();

        int total = 1 ;
        int i = 1;

        for (i = 1; i <= us; i++) {
            total *= taban;
        }
        System.out.println("Sonuc: " + total);
    }
}
