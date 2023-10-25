import java.util.Scanner;
public class SinifGecmeNotu {
    public static void main(String[] args) {

        double mat,fizik,turkce,kimya,muzik,ortalama;

        Scanner input= new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");

        mat= input.nextDouble();

        System.out.println("Fizik Notunuzu Giriniz: ");

        fizik= input.nextDouble();

        System.out.println("Türkçe Notunuzu Giriniz: ");

        turkce= input.nextDouble();

        System.out.println("Kimya Notunuzu Giriniz: ");

        kimya= input.nextDouble();

        System.out.println("Müzik Notunuzu Giriniz: ");

        muzik= input.nextDouble();

        ortalama= (mat+fizik+turkce+kimya+muzik)/5;

        if(ortalama>=55) {

            System.out.println("Ortalamanız: " + ortalama);

            System.out.println("Sınıfı Geçtiniz");

        } else{
            System.out.println("Ortalamanız: " + ortalama);

            System.out.println("Kaldınız");
        }
    }
}
