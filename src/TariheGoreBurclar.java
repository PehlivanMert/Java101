import java.util.Scanner;
public class TariheGoreBurclar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum gününüzü giriniz: ");
        int gun = input.nextInt();

        System.out.print("Doğum ayınızı giriniz: ");
        int ay = input.nextInt();

        switch (ay) {
          case 1:
              if (gun < 22) {
                  System.out.println("Oğlak");
              } else {
                  System.out.println("Kova");
              }
              break;
          case 2:
              if (gun < 20) {
                  System.out.println("Kova");
              } else {
                  System.out.println("Balık");
              }
              break;
          case 3:
              if (gun < 21) {
                  System.out.println("Balık");
              } else {
                  System.out.println("Koç");
              }
              break;
          case 4:
              if(gun < 22) {
                  System.out.println("Koç");
              } else{
                  System.out.println("Boğa");
              }
              break;
          case 5:
              if (gun < 22) {
                  System.out.println("Boğa");
              } else {
                      System.out.println("İkizler");
              }
              break;
          case 6:
              if (gun < 23) {
                  System.out.println("İkizler");
              } else {
                  System.out.println("Yengeç");
              }
              break;
          case 7:
              if (gun < 23) {
                  System.out.println("Yengeç");
              } else {
                  System.out.println("Aslan");
              }
              break;
          case 8:
              if (gun < 23) {
                  System.out.println("Aslan");
              } else {
                  System.out.println("Başak");
              }
              break;
          case 9:
              if (gun < 23) {
                  System.out.println("Başak");
              } else {
                  System.out.println("Terazi");
              }
              break;
          case 10:
              if (gun < 23) {
                  System.out.println("Terazi");
              } else {
                  System.out.println("Akrep");
              }
              break;
          case 11:
              if (gun < 22) {
                  System.out.println("Akrep");
              } else {
                  System.out.println("Yay");
              }
              break;
          case 12:
              if (gun < 22) {
                  System.out.println("Yay");
              } else {
                  System.out.println("Oğlak");
              }
              break;

          default:
              System.out.println("Hatalı Tarih Girdiniz :) ");
      }
    }
}