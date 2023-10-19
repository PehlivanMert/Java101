//Vki Hesaplayan Program

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

    public static void main(String[] args) {

        double boy, kilo, vki;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz : ");
        boy = girdi.nextDouble();
        System.out.print("Kilonuzu Giriniz : ");
        kilo = girdi.nextDouble();
        vki= kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);
    }
}

/*
@ Author: Mert Pehlivan
@ Date: 15.10.2019
@ IDE: IntelliJ IDEA
 */