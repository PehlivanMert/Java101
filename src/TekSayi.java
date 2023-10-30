import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int deger= input.nextInt();
        int sayi;

        for(sayi=1 ; sayi<=deger; sayi++) {
            if (sayi % 2 == 0) {

                continue;
            }
                System.out.print(sayi + ",");







        }
    }
}
