import java.util.Scanner;
public class GunlukKurHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dolar kurunu giriniz: ");
        double dolarKuru = input.nextDouble();
        System.out.print("Euro kurunu giriniz: ");
        double euroKuru = input.nextDouble();
        System.out.print("Sterlin kurunu giriniz: ");
        double sterlinKuru = input.nextDouble();
        System.out.print("Dolar miktarını giriniz: ");
        double dolarMiktari = input.nextDouble();
        System.out.print("Euro miktarını giriniz: ");
        double euroMiktari = input.nextDouble();
        System.out.print("Sterlin miktarını giriniz: ");
        double sterlinMiktari = input.nextDouble();
        double toplam = dolarKuru * dolarMiktari + euroKuru * euroMiktari + sterlinKuru * sterlinMiktari;
        System.out.println("Toplam: " + toplam);
    }}
