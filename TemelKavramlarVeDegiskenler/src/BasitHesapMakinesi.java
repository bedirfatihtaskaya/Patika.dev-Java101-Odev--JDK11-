import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int s1, s2;
        String islem;

        System.out.print("1. sayıyı giriniz: ");
        s1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        s2 = input.nextInt();

        islem = input.nextLine();
        System.out.print("Yapılacak işlemi seçiniz\nToplama(+)\nÇıkarma(-)\nÇarpma(*)\nBölme(/)\n:");
        islem = input.nextLine();

        switch (islem) {

            case ("+"):
                System.out.print("1. sayı ile 2. sayının toplamı: " + (s1 + s2));
                break;
            case ("-"):
                System.out.print("1. sayının 2. sayıdan çıkarılması: " + (s1 - s2));
                break;
            case ("*"):
                System.out.print("1. sayı ile 2. sayının çarpımı: " + (s1 * s2));
                break;
            case ("/"):
                System.out.print("1. sayının 2. sayıya bölümü: " + (s1 / s2));
                break;
            default:
                System.out.print("Yanlış işlem yaptınız. Lütfen tekrar deneyiniz!!");
        }
    }
}
