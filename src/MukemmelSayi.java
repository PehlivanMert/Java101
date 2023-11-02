//Mükemmel Sayı Nedir ?
//Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int n1;
        int total = 0;

        System.out.print("Bir Sayı Giriniz: ");
        n1 = giris.nextInt();

        for (int i = 1; i < n1; i++) {

            if (n1 % i == 0) {
                total += i;
            }
        } if (total==n1) {

            System.out.println("Bu sayı Mükemmel Bir Sayı, bu sayının eşi benzeri yoktur wow :)");
        } else {
            System.out.println("Bu sayının mükemmellikle uzaktan yakından alakası yok :) ");
        }
    }
}

