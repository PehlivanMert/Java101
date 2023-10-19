/* Java ile gidilen mesafeye (KM) göre taksimetre ücretini ekrana yazdıran program
Km Ücreti = 2.20 TL
Minimum Ödenecek Ücret = 20 TL
Taksimetre açılış Ücreti = 10 TL
 */
import java.util.Scanner;
public class TaksimetreHesaplayanProg {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double km, ucret;
        System.out.print("Gidilen Mesafeyi Giriniz: ");
        km = girdi.nextDouble();
        ucret = 10 + (km * 2.20);
        ucret= (ucret < 20) ? 20 : ucret;
        System.out.println("Taksimetre Ücreti: " + ucret);
    }
}


/* @Author: Mert Pehlivan
    * @ Date: 19.10.2023
    * @ IDE: IntelliJ IDEA
*/