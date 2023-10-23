import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        userName=input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password= input.nextLine();

        if (userName.equals("PehlivanMert") && (password.equals("Mert12345"))){
            System.out.print("Giriş Başarılı");
        }else {
            System.out.println("Bilgilerinizi Kontrol Ediniz. ");
        }


    }
}
