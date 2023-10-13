import java.util.Scanner;
public class OgrenciOrtalamaSistemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);
        System.out.println(sonuc >= 60 ? "Sınıfı geçti" : "Sınıfta kaldı");


    }
}
