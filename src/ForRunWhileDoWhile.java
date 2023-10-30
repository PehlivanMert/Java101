import java.util.Scanner;
public class ForRunWhileDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        /* for(boolean calis = true; calis ;){

            System.out.print("Sayı giriniz: ");

            sayi = input.nextInt();

            if (sayi<0) {
                System.out.println("Program durdu");
                calis = false;
            }
        }


        System.out.println("****************");

         */


        /* System.out.print("Sayı Giriniz: ");
        sayi= input.nextInt();
        while(sayi>0) {
            System.out.print("Sayı Giriniz: ");
            sayi= input.nextInt();


        }

        System.out.println("Program Bitti");

         */

        do {
            System.out.print("Sayıyı Giriniz: ");
            sayi = input.nextInt();


        } while (sayi>0); {


            System.out.println("Program Bitti");
        }

    }


}
