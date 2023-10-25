import java.util.Scanner;
public class SicakligaGoreEtkinlik {
    public static void main(String[] args) {

        double sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz: ");

        sicaklik = input.nextDouble();

        if (sicaklik < 5) {

            System.out.println("Kayak Yapabilirsiniz.");

        }else if (sicaklik >= 5 && sicaklik <= 15) {

            System.out.println("Sinemaya Gidebilirsiniz.");

        }else if (sicaklik >= 10 && sicaklik <= 25) {

            System.out.println("Pikniğe Gidebilirsiniz.");

        }else if (sicaklik > 25) {

            System.out.println("Yüzmeye Gidebilirsiniz.");


        }
    }
}
