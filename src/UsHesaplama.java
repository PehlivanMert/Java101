public class UsHesaplama {

    static int usPower(int taban, double us) {

        if (us == 0) {
            return 1;
        } else {
            return taban * usPower(taban, us - 1);
        }

    }
    public static void main(String[] args) {
        System.out.println(usPower(5,5));
    }
}