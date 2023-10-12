//Javada Dairenin alanını hesaplama

import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        alan = pi * r * r;
        System.out.println("Dairenin alanı: " + alan);
    }
}
