import java.util.Scanner;
public class NotOrtalamasi1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Matematik notunuzu giriniz: ");   // 0-100 arası
            int matematik = input.nextInt();
            System.out.print("Fizik notunuzu giriniz: ");
            int fizik = input.nextInt();
            System.out.print("Türkçe notunuzu giriniz: ");
            int turkce = input.nextInt();
            System.out.print("Kimya notunuzu giriniz: ");
            int kimya = input.nextInt();
            System.out.print("Müzik notunuzu giriniz: ");
            int muzik = input.nextInt();
            System.out.println("İngilizce notunuzu giriniz: ");
            int ingilizce = input.nextInt();
            System.out.println("Beden Eğitimi notunuzu giriniz: ");
            int bedenEgitimi = input.nextInt();
            System.out.println("Almanca notunuzu giriniz: ");
            int Almanca = input.nextInt();
            System.out.println("Biyoloji notunuzu giriniz: ");
            int biyoloji = input.nextInt();
            System.out.println("Tarih notunuzu giriniz: ");
            int tarih = input.nextInt();
            double ortalama = (turkce + matematik + ingilizce + fizik + kimya + muzik + bedenEgitimi + Almanca + biyoloji + tarih)/10.0;
            System.out.println("Ortalama: " + ortalama);

            boolean kosul1 = ortalama >= 60;
            String sonuc = kosul1 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
            System.out.println(sonuc);

            }
        }


// @Author: Mert PEHLIVAN
// * Date: 17.10.2023 Tuesday
// * IDE: intellij idea




