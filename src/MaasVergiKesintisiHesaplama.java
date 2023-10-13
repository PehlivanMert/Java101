import java.util.Scanner;
public class MaasVergiKesintisiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maas, vergi, kesinti;
        System.out.println("Maaşınızı Giriniz: ");
        maas = input.nextDouble();
        if (maas < 1000) {
            System.out.println("Maaşınız 1000 TL'den Küçük Olamaz!");
        } else {
            if (maas < 2000) {
                vergi = maas * 0.1;
                kesinti = maas - vergi;
                System.out.println("Vergi Kesintisi: " + vergi);
                System.out.println("Kesinti Sonrası Maaş: " + kesinti);
            } else {
                if (maas < 3000) {
                    vergi = maas * 0.15;
                    kesinti = maas - vergi;
                    System.out.println("Vergi Kesintisi: " + vergi);
                    System.out.println("Kesinti Sonrası Maaş: " + kesinti);
                } else {
                    if (maas < 4000) {
                        vergi = maas * 0.2;
                        kesinti = maas - vergi;
                        System.out.println("Vergi Kesintisi: " + vergi);
                        System.out.println("Kesinti Sonrası Maaş: " + kesinti);
                    } else {
                        if (maas < 5000) {
                            vergi = maas * 0.25;
                            kesinti = maas - vergi;
                            System.out.println("Vergi Kesintisi: " + vergi);
                            System.out.println("Kesinti Sonrası Maaş: " + kesinti);
                        } else {
                            vergi = maas * 0.3;
                            kesinti = maas - vergi;
                            System.out.println("Vergi Kesintisi: " + vergi);
                            System.out.println("Kesinti Sonrası Maaş: " + kesinti);
                        }
                    }
                }
            }
        }
    }}
