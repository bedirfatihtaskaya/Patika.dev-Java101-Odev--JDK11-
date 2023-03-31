import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int turkce,matematik,fizik,kimya,tarih,muzik;
        double average = 0;
        System.out.println("Sınıfı geçme programına hoşgeldiniz. Lütfen 0 ve 100 arasında not değeri giriniz.");

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        if (0<= turkce && turkce <= 100){
            average += turkce;
        }
        if (0<= matematik && matematik <= 100){
            average += matematik;
        }
        if (0<= fizik && fizik <= 100){
            average += fizik;
        }
        if (0<= kimya && kimya <= 100){
            average += kimya;
        }
        if (0<= tarih && tarih <= 100){
            average += tarih;
        }
        if (0<= muzik && muzik <= 100){
            average += muzik;
        }
        average = average / 6 ;
        if (average >= 55){
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        else {
            System.out.println("Maalesef sınıfı geçemediniz.");
        }
        System.out.print("Ortalamanız: " + (float)average);
    }
}
