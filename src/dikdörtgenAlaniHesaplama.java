import java.util.Scanner;

public class DikdörtgenAlaniHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int kısaKenar = input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int uzunKenar = input.nextInt();
        int alan = kısaKenar * uzunKenar;
        System.out.println("Dikdörtgenin alanı: " + alan);
    }
}
