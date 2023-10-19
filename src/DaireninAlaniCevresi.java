//Javada Dairenin alanını ve çevresini hesaplama

import java.util.Scanner;
public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, cevre;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = girdi.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

    }
}

/*  * @Author: Mert Pehlivan
    * @ Date: 19.10.2023
    * @ IDE: IntelliJ IDEA
*/
