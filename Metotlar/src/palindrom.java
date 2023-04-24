import java.util.Scanner;

public class palindrom {
    static boolean palindromMu(int sayi){
        boolean dogruluk;
        int gecici = sayi, tersSayi = 0, sonRakam,adet=0;
        while (gecici != 0){
            sonRakam = gecici % 10;
            tersSayi = (tersSayi * 10) + sonRakam;
            gecici /= 10;
            adet++;
        }
        if (sayi != 0){
            if (sayi % 10 == tersSayi % 10){
                sayi = sayi % (10^(adet-1));
                sayi = sayi / 10;
                return palindromMu(sayi);
            }
            else{
                dogruluk = false;
            }
        }
        else {
            dogruluk = true;
        }

        return dogruluk;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kDeger, sayi;
        System.out.print("Bir sayı giriniz: ");
        kDeger = input.nextInt();
        sayi = kDeger;
        if (palindromMu(kDeger)) {
            System.out.println(sayi + " sayısı palindrom sayıdır.");
        }
        else {
            System.out.println(sayi + " sayısı palindrom sayı değildir.");
        }
    }
}
