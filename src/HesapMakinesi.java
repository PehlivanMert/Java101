import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int number1,number2,islem;

        Scanner input=new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");

        number1=input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");

        number2=input.nextInt();

        System.out.print("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("\n\nİşlemi Giriniz: ");

        islem=input.nextInt();

        switch (islem) {

            case 1 :

                System.out.println("\nSonuç: " +  (number1 + number2));

            break;

            case 2 :

                System.out.println("\nSonuç: " +(number1-number2));

            break;

            case 3 :

                System.out.println("\nSonuç: " +(number1*number2));

            break;

            case 4 :

                if (number2 !=0) {

                    System.out.println("\nSonuc: " + (number1 / number2));

                } else {

                    System.out.println("\nHatalı Giriş Yaptınız!");

                }

            break;
        }
    }
}
