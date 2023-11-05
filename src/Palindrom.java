public class Palindrom {

    static boolean isPalindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            //System.out.println("=================");

            lastNumber = temp % 10;
            //System.out.println("son sayi : " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println(" tersi ; " + reverseNumber);

            temp /= 10;
            //System.out.println("islemden sonra ki yeni sayi :" + temp);
        }

        if (number == reverseNumber)
        {return true;
        } else{
         return false ;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(9234));
    }

}
