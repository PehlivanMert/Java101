
import java.util.Scanner;
public class BasamakDegerleriniToplama {
    public static void main(String[] args) {

        Scanner girdi = new Scanner (System.in);
        System.out.print("Bir Sayı Giriniz: ");
            int sayi = girdi.nextInt();
            int basamakSayisi = 0;
            int tempSayi = sayi;
            int basDegeri;
            int sonuc = 0;
            while (tempSayi != 0) {
                tempSayi /= 10;
                basamakSayisi++;
            }
            tempSayi = sayi;
            while (tempSayi != 0) {
                basDegeri = tempSayi % 10;

                for (int i = 1; i <= basamakSayisi; i++){}
                sonuc += basDegeri;

                tempSayi /= 10;
            }
        System.out.println("Basamak Değerlerinin Toplamı: " + sonuc);

    }
}
