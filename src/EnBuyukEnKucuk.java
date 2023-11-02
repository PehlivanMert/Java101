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
            int sayii = input.nextInt();
            if (i == 1) {
                enBuyuk = sayii;
                enKucuk = sayii;
            }
            if (sayii > enBuyuk) {
                enBuyuk = sayii;
            }
            if (sayii < enKucuk) {
                enKucuk = sayii;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
