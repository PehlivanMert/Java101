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

        // Notlar 0 ile 100 arasında değilse hesaplamaya katılmasın ve uyarı olsun.

        if(mat>0 && mat<=100 && fizik>0 && fizik<=100 && turkce>0 && turkce<=100 && kimya>0 && kimya<=100 && muzik>0 && muzik<=100){

            if(ortalama>=55){
                System.out.println("Sınıfı Geçtiniz. Ortalamanız: "+ortalama);
            }
            else{
                System.out.println("Sınıfta Kaldınız. Ortalamanız: "+ortalama);
            }
        }
        else{
            System.out.println("Lütfen 0 ile 100 arasında bir not giriniz.");
        }
    }
}
