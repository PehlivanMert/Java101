
/*Java While ve Do-While Arasındaki Farklar ?
Java'da Do-While ve While döngüleri arasındaki tek fark , Do-while döngüsünde, döngü bloğu içindeki kod kesimi en az bir kez mutlaka işletilecektir.
Çünkü önce döngü bloğu işletilip sonra koşul denetlenmektedir. While döngüsünde ise önce koşula bakılıp sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi olasıdır. */


import java.util.Scanner;
public class DoWhileKullanici {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String userName = "MertPehlivan";
        String password = "123456";
        int right = 3;
        boolean isLogged = false;
        System.out.println("    **********");
        System.out.println(" Kullanıcı Girişi");
        System.out.println("    **********");
        System.out.println();
        do {
            System.out.print("  Kullanıcı Adı: ");
            String userName1 = input.nextLine();
            System.out.print("  Şifre: ");
            String password1 = input.nextLine();
            if (userName.equals(userName1) && password.equals(password1)) {
                System.out.println("  Giriş Başarılı");
                isLogged = true;
                break;
            } else if (!userName.equals(userName1) && password.equals(password1)) {
                System.out.println("  Kullanıcı Adı Hatalı");
                right--;
                System.out.println("  Kalan Hakkınız: " + right);
            } else if (userName.equals(userName1) && !password.equals(password1)) {
                System.out.println("  Şifre Hatalı");
                right--;
                System.out.println("  Kalan Hakkınız: " + right);
            } else {
                System.out.println("  Kullanıcı Adı ve Şifre Hatalı");
                right--;
                System.out.println("  Kalan Hakkınız: " + right);
            }
        } while (right > 0);
    }
}
