import java.util.Scanner;
public class Kdv3 {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.print("Kdv Hariç Tutarı Giriniz: ");

        double tutar = girdi.nextDouble();

        tutar=tutar < 1000 ? tutar + (tutar * 0.20) : tutar + (tutar * 0.08);

        System.out.println("Kdv Dahil Tutar: " + tutar);

    }
}
