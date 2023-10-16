public class Kosul {
    public static void main(String[] args)
    {
        int a = 5, b = 6, c = 5;
        boolean kosul = a == c;
        boolean kosul2 = a >= b;
        boolean sonuc = kosul && kosul2;
        boolean sonuc2 = (kosul || kosul2);
        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(!sonuc2);

    }
}
