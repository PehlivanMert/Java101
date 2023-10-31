//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
import java.util.Scanner;
public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayi = input.nextInt();
        int enBuyuk = 0;
        int enKucuk = 0;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi2 = input.nextInt();
            if (i == 1) {
                enBuyuk = sayi2;
                enKucuk = sayi2;
            }
            if (sayi2 > enBuyuk) {
                enBuyuk = sayi2;
            }
            if (sayi2 < enKucuk) {
                enKucuk = sayi2;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
