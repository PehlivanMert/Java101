import java.util.Scanner;
        public class Kdv1 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Ürünün Kdv hariç fiyatını giriniz: ");
                int urunFiyati = input.nextInt();
                if (urunFiyati < 1000) {
                    double kdvOrani1 = 0.20;

                double kdv = urunFiyati * kdvOrani1;
                double urunkdvdahilfiyat = urunFiyati + kdv;
                System.out.print("Kdv Dahil Satis Fiyati : " + urunkdvdahilfiyat + " TL");
            }
                else {
                    double kdvOrani2 = 0.08;
                    double kdv2 = urunFiyati * kdvOrani2;
                    double urunkdvdahilfiyat2 = urunFiyati + kdv2;
                    System.out.print("Kdv Dahil Satis Fiyati : " + urunkdvdahilfiyat2 + " TL");
                }



            }
        }
