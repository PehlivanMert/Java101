import java.util.Scanner;
public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner deger= new Scanner(System.in);
        int sayi;
        int total=0;

        do{
            System.out.print("Sayıyı Giriniz: ");
            sayi= deger.nextInt();

            if(sayi % 2 == 1) {
                total+=sayi;
            }

        } while(sayi>0);

            System.out.println("Toplam : " +  total);
    }
}
