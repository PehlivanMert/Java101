// 1-100 arası Asal sayıları bulan programı yazınız.
public class AsalSayilar {
    public static void main(String[] args) {
        int sayi = 0;
        int sayac = 0;

        for (int i = 2; i < 100; i++) {
            sayi = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayi++;
                }
            }
            if (sayi == 0) {
                System.out.println(i);
                sayac++;
            }
        }
        System.out.println("Toplam " + sayac + " adet asal sayı vardır.");
    }
}

