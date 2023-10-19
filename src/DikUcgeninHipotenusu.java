import java.util.Scanner;
import static java.lang.Math.sqrt;
public class DikUcgeninHipotenusu {
    public static void main(String[] args) {

        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Scanner input=new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        int birinciKenar = input.nextInt();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        int ikinciKenar = input.nextInt();

        double hipotenus = sqrt((birinciKenar * birinciKenar) + (ikinciKenar * ikinciKenar));
        System.out.println("Hipotenüs: " + hipotenus);
    }
}

/* @Author: Mert PEHLIVAN
 Date: 19.10.2023 Tuesday
 IDE: intellij idea
 */