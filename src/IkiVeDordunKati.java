/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. */

import java.util.Scanner;
public class IkiVeDordunKati {
    public static void main(String[] args) {
        Scanner deger= new Scanner(System.in);
        int sayi;
        int total = 0;
        int i = 0 ;
        do{
            System.out.print("Sayıyı Giriniz: ");
            sayi= deger.nextInt();

            if(sayi % 2 ==0 && sayi % 4 == 0) {

                total += sayi;
                i++ ;
            }
        }while (sayi % 2 == 0);

        System.out.println("İkiye ve Dörde tam bölünen sayıların ortalması: " + total/i);
    }
}
