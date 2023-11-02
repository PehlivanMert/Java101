import java.util.Scanner;

public class YildizlarlaElmasYapma{
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
 // a:basamak sayısı , b:boşluk sayısı , c=yıldız sayısı
        int a;

        System.out.print("Sayıyı Giriniz: ");
        a = inp.nextInt();

        for (int i=0 ; i < a ; i++){

            for (int b=0 ; b < a-i ; b++){
                System.out.print(" ");
            }

            for (int c=0 ; c <= 2*i ; c++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i=0 ;i <= a;i++){

            for (int b=0; b < i ;b++){
                System.out.print(" ");
            }

            for (int c=0; c <= 2*(a-i) ; c++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}