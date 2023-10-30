// Bir şifre ve kullanıcı adı belirleyin ve kullanıcıdan şifreyi ve kullanıcı adını girmesini isteyin.
// Kullanıcı adı yanlış ise kullanıcıya şifreyi tekrar sorma hakkı verin.   3 hakkı olsun.  3 hakkı da yanlış girerse
// “Daha sonra tekrar deneyin” mesajı versin.  Kullanıcı adı doğru ise şifreyi sormadan “Giriş Başarılı” mesajı versin.
// Şifre yanlış ise kullanıcıya 3 hakkı olsun ve şifreyi tekrar sorsun. 3 hakkı da yanlış girerse “Daha sonra tekrar deneyin” mesajı versin.
// Şifre doğru ise “Giriş Başarılı” mesajı versin.



import java.util.Scanner;
public class WhileDongusuKullanici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "Mert";
        String password = "1234";
        int right = 3;
        while (right > 0) {
            System.out.print("Kullanıcı Adı: ");
            String userName1 = input.nextLine();
            System.out.print("Şifre: ");
            String password1 = input.nextLine();
            if (userName.equals(userName1) && password.equals(password1)) {
                System.out.println("Giriş Başarılı");
                break;
            } else if (!userName.equals(userName1) && password.equals(password1)) {
                System.out.println("Kullanıcı Adı Hatalı");
                right--;
                System.out.println("Kalan Hakkınız: " + right);
            } else if (userName.equals(userName1) && !password.equals(password1)) {
                System.out.println("Şifre Hatalı");
                right--;
                System.out.println("Kalan Hakkınız: " + right);
            } else {
                System.out.println("Kullanıcı Adı ve Şifre Hatalı");
                right--;
                System.out.println("Kalan Hakkınız: " + right);
            }
            if (right == 0) {
                System.out.println("Daha sonra tekrar deneyin");
            }
        }

    }
}