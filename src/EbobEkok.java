import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int i = 1;
        int ebob = 1;

            System.out.print("a sayısını giriniz: ");
            a = input.nextInt();

            System.out.print("b sayısını giriniz: ");
            b= input.nextInt();

            if(a < b) {
                for (i = 1; i <= a; i++) {

                    if (a % i == 0 && b % i == 0) {
                        ebob = i;
                    }
                }
                System.out.println("Girilen sayıların ebobu: " + ebob);

            } else {
                for (i = 1 ; i <= b ; i++) {
                    if (a % i ==0 && b % i ==0) {
                        ebob=i;
                    }
                }
                System.out.println("Girilen sayıların ebobu: " + ebob);
            }

    }
}
