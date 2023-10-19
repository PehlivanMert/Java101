import java.util.Scanner;
public class Kdv2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün Kdv hariç fiyatını giriniz: ");
        int urunFiyati = input.nextInt();
      boolean kosul1 = urunFiyati < 1000;
        double kdvOrani1 = 0.18;
        double kdvOrani2 = 0.08;
        double kdv = urunFiyati * kdvOrani1;
        double kdv2 = urunFiyati * kdvOrani2;
        double urunkdvdahilfiyat = urunFiyati + kdv;
        double urunkdvdahilfiyat2 = urunFiyati + kdv2;
        System.out.println(kosul1 ? "Kdv dahil fiyatı: " + urunkdvdahilfiyat : "Kdv dahil fiyatı: " + urunkdvdahilfiyat2);
    }
}

/* @Author: Mert PEHLIVAN
 Date: 19.10.2023 Tuesday
 IDE: intellij idea
 */
