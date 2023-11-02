public class BreakContinue {
    public static void main(String[] args) {

        for(int i = 1 ; i<=50 ; i++) {
            /*if(i==6) {
                System.out.println("i değeri 6 dır");
                break;
            } */

            if(i==5) {
                System.out.println("Amasya");
                continue;
            }
            if(i == 48) {
                System.out.println("Rabia");
                continue;
            }
            System.out.println(i);
        }
    }
}

                            /* int i = 0;
                            while (i < 10) {
                              i++;
                              if (i == 5) {
                                continue;
                              }
                              System.out.println(i);
                            }
                                          */