import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        double boy,bki;
        int kilo;

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        bki = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + bki);
    }
}
