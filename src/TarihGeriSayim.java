import java.util.Scanner;
public class TarihGeriSayim {
    public static void main(String[] args) {
//Girilen Tarih ile bugün arasındaki gün farkını ve saat çarpımını bulan program
        Scanner input = new Scanner(System.in);
        int gun, ay, yil, gun1, ay1, yil1, toplamgun, toplamgun1, fark, saat, dakika, saniye;
        System.out.println("Günü Giriniz: ");
        gun = input.nextInt();
        System.out.println("Ayı Giriniz: ");
        ay = input.nextInt();
        System.out.println("Yılı Giriniz: ");
        yil = input.nextInt();
        System.out.println("Saat Giriniz: ");
        saat = input.nextInt();
        System.out.println("Dakika Giriniz: ");
        dakika = input.nextInt();
        System.out.println("Saniye Giriniz: ");
        saniye = input.nextInt();
        toplamgun = gun + ay * 30 + yil * 365;
        toplamgun1 = saat * 3600 + dakika * 60 + saniye;
        System.out.println("Günü Giriniz: ");
        gun1 = input.nextInt();
        System.out.println("Ayı Giriniz: ");
        ay1 = input.nextInt();
        System.out.println("Yılı Giriniz: ");
        yil1 = input.nextInt();
        fark = (gun1 + ay1 * 30 + yil1 * 365) - toplamgun;
        System.out.println("Girilen Tarih ile Bugün Arasındaki Gün Farkı: " + fark);
        System.out.println("Girilen Tarih ile Bugün Arasındaki Saat Farkı: " + fark * 24);
        System.out.println("Girilen Tarih ile Bugün Arasındaki Dakika Farkı: " + fark * 24 * 60);
        System.out.println("Girilen Tarih ile Bugün Arasındaki Saniye Farkı: " + fark * 24 * 60 * 60);
        System.out.println("Girilen Tarih ile Bugün Arasındaki Toplam Saniye Farkı: " + (fark * 24 * 60 * 60 + toplamgun1));
    }
}