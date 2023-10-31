import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Degeri giriniz: ");
        sayi = input.nextInt();

        System.out.print("4'ün kuvvetleri : ");
        for (int i = 1 ; i <= sayi ; i*=4 ){

        System.out.print( i + ",");
        }
        System.out.println();
        System.out.println();
        System.out.print("5'in kuvvetleri : ");

        for (int i = 1 ; i <= sayi ; i*= 5) {
            System.out.print(  i + ",");
        }

    }
}
