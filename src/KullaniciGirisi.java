import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, newpassword,change;


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        // Kullanıcı Adı ve Şifre Kontrolü

        if (userName.equals("PehlivanMert") && (password.equals("Mert12345"))) {

            System.out.print("Giriş Başarılı");

            //Kullanıcı adı yanlışsa

        } else if (!userName.equals("PehlivanMert") && (password.equals("Mert12345"))) {

            System.out.println("Kullanıcı Adınızı Kontrol Ediniz!");

            // Şifre yanlışsa uyarı mesajı ve şifre değiştirme seçeneği

        } else if (userName.equals("PehlivanMert") && (!password.equals("Mert12345"))) {

            System.out.println("Parolanızı Kontrol Ediniz!");

            System.out.print("1-Paralonızı Değiştirmek İstiyorsanız: \n2-Devam Etmek İçin: \n=>");

            change = input.nextLine();

            // Şifre değiştirme işlemi

            switch (change) {

                case "1":

                    // Eski ve yeni şifre aynı ise uyarı mesajı

                    System.out.print("Yeni Parolanızı Giriniz: ");

                    newpassword = input.nextLine();

                    if (newpassword.equals("Mert12345")) {

                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                    }else if (!newpassword.equals("Mert12345")) {

                        System.out.println("Şifre Oluşturma Başarılı.");
                    }

                    break;

                    // Şifre değiştirmek istemiyorsa;

                case "2":

                    System.out.println("Tekrar Deneyiniz! ");

                    break;
            }
                    // Kullanıcı adı ve şifre yanlışsa;
        } else {


            System.out.println("Bilgilerinizi Kontrol Ediniz. ");

        }


    }
}


