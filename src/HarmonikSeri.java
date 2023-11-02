import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner girdi = new Scanner (System.in);
        System.out.print("Sayıyı Giriniz: ");
        int number = girdi.nextInt();
        double result = 0.0 ;
        for(int i = 1 ; i <= number ; i++) {
            result += (1.0/i) ;
        }
        System.out.println(number  + " Harmonik Serisi: " + result);

    }
}
