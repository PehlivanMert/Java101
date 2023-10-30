import java.util.Scanner;
public class UcveDordeBolunenSayilar {
    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.print("Sayıyı Giriniz: ");
            int sayi = input.nextInt();

            for (int i = 0; i <= sayi; i++) {
                if (i % 3 != 0 && i % 4 != 0) {
                    continue;
                }

                System.out.print(i + ",");


            }
    }
}



