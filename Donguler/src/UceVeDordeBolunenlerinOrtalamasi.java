import java.util.Scanner;
public class UceVeDordeBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kullaniciDeger, toplam=0, sayiAdet=0;

        System.out.print("Bir sayı giriniz: ");
        kullaniciDeger = input.nextInt();

        for (int sayac = 0; sayac <= kullaniciDeger; sayac++){
            if (sayac % 3 == 0 || sayac % 4 == 0){
                toplam += sayac;
                sayiAdet ++;
            }
        }
        System.out.print("0'dan " + kullaniciDeger + " sayısına kadar olan ve 3 ile 4'e tam bölünen sayıların ortalaması: " + (toplam / sayiAdet));
    }
}
