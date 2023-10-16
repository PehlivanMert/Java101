public class DersOrtalamaHesaplama {
    public static void main(String[] args) {
        int turkce = 80;
        int matematik = 50;
        int ingilizce = 90;
        int fizik = 50;
        int kimya = 60;
        int muzik = 100;
        int bedenEgitimi = 100;
        int Almanca = 40;
        int biyoloji = 50;
        int tarih = 50;
        int toplam = turkce + matematik + ingilizce + fizik + kimya + muzik + bedenEgitimi + Almanca + biyoloji + tarih;
        double ortalama = toplam / 10.0;
        System.out.println("Ortalama: " + ortalama);
        if (ortalama >= 60) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
