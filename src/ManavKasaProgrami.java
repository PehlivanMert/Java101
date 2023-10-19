//Manav Kasa Programı
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double elma,armut,domates,muz,patlican,toplam;

        Scanner kilo = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut = kilo.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = kilo.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = kilo.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = kilo.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = kilo.nextDouble();

        toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
        System.out.println("Toplam Tutar : "+toplam+" TL");
    }
}

/*   @Author: Mert Pehlivan
     *Date: 19.10.2023
     *IDE: IntelliJ IDEA
                               */