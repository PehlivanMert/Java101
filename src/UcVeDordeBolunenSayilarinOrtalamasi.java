import java.util.Scanner;
public class UcVeDordeBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int i = 0 ;
        int total =0;
        int sayi;

        Scanner girdi = new Scanner (System.in);




        do{
            System.out.print("Sayıyı Giriniz: ");
            sayi = girdi.nextInt();

            if(sayi % 3 == 0 && sayi % 4==0) {

                total += sayi;
                i++;
            }

        }
        while (sayi>0);
        System.out.println("Ortalaması: " + total/i);


    }
}
