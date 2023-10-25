import java.util.Scanner;
public class UcakBiletiHesaplayanProg {
    public static void main(String[] args) {
        int yas, tip, km;
        double tutar;


        Scanner girdi = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz : ");

        yas = girdi.nextInt();

        System.out.print("Km'yi giriniz: ");

        km = girdi.nextInt();

        System.out.print("Tek yön için 1 ; Gidiş Dönüş için 2; ");

        tip = girdi.nextInt();

        tutar = km * 0.10;

        //Temel indirimleri tanımladım.

        double indirim1 = tutar - (tutar * 0.50);
        double indirim2 = tutar - (tutar * 0.10);
        double indirim3 = tutar - (tutar * 0.30);

        // Uçuş Tipine göre switch case ile koşul oluşturdum.

        switch (tip) {

            case 1:
            // Km sıfırdan büyük olmalı.

                if (km > 0) {

                    // yaşlara göre indirimli fiyatları yazdırdım.

                    if ( yas > 0 && yas < 12) {

                        System.out.println("Bilet Ücretiniz: " + indirim1 + "TL");

                    } else if (yas < 24 && yas > 12) {

                        System.out.println("Bilet Ücretiniz: " + indirim2 + "TL");

                    } else if (yas >= 65) {

                        System.out.println("Bilet Ücretiniz: " + indirim3 + "TL");

                    } else if (yas < 65 && yas > 23){

                        System.out.println("Bilet Ücretiniz: " + tutar + " TL");

                    } else {

                        System.out.println("Hatalı Veri Girdiniz!");
                    }


                } else {
                    System.out.println("Hatalı Veri Girdiniz!");

                }
                break;

                // Gidiş Dönüş için switch case oluşturdum.

            case 2:

                if (km > 0) {


                    if (yas > 0 && yas < 12) {

                        System.out.println("Bilet Ücretiniz: " + ((indirim1-(indirim1 * 0.20))*2) + "TL");

                    } else if (yas < 24 && yas > 12) {

                        System.out.println("Bilet Ücretiniz: " + ((indirim2-(indirim2 * 0.20))*2) + "TL");

                    } else if (yas >= 65 ) {

                        System.out.println("Bilet Ücretiniz: " + ((indirim3-(indirim3 * 0.20))*2) + "TL");

                    } else if (yas < 65 && yas > 23 ) {

                        System.out.println("Bilet Ücretiniz: " + ((tutar-(tutar * 0.20))*2) + "TL");

                    } else {

                        System.out.println("Hatalı Veri Girdiniz!");
                    }

                } else {

                    System.out.println("Hatalı Veri Girdiniz!");

                }
                break;

            default:

                System.out.println("Hatalı Veri Girdiniz!");


        }
    }
}
