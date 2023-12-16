
import java.util.Scanner;
public class BasamakDegerleriniToplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = girdi.nextInt();
        int basDegeri;
        int sonuc = 0;

        while (sayi != 0) {

            basDegeri = sayi % 10;
            sonuc += basDegeri;
            sayi /= 10;
        }
        System.out.println("Basamak Değerlerinin Toplamı: " + sonuc);

    }
}
