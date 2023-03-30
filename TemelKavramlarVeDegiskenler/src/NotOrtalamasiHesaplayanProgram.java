import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int turkce,matematik,fizik,kimya,tarih,muzik;
        System.out.print("Türkçe Notunu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Matematik Notunu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik Notunu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Tarih Notunu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunu giriniz: ");
        muzik = input.nextInt();
        double sonuc = (turkce + matematik + fizik + kimya + tarih + muzik)/ 6;
        boolean durum = sonuc >=60;
        String gecti_kaldi = durum ? "Geçti" : "Kaldı";
        System.out.print(gecti_kaldi);
    }
}
