import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mesafe,yas,tip;
        double toplamTutar,tutarMesafe,indirimYas,indirimTip;

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini giriniz\n1) Tek yön\n2) Gidiş dönüş\n: ");
        tip = input.nextInt();

        if ((mesafe > 0) && (yas > 0) && (tip == 1 || tip == 2)){
            if (tip == 1){
                if (yas<12){
                    tutarMesafe = mesafe * 0.10;
                    indirimYas = tutarMesafe * 0.50;
                    toplamTutar = tutarMesafe - indirimYas;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }
                else if (12 <= yas && yas <= 24){
                    tutarMesafe = mesafe * 0.10;
                    indirimYas = tutarMesafe * 0.10;
                    toplamTutar = tutarMesafe - indirimYas;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }
                else if (65 <= yas){
                    tutarMesafe = mesafe * 0.10;
                    indirimYas = tutarMesafe * 0.30;
                    toplamTutar = tutarMesafe - indirimYas;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }else{
                    tutarMesafe = mesafe * 0.10;
                    toplamTutar = tutarMesafe;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }
            }

            else{
                if (yas<12){
                    tutarMesafe = mesafe * 0.10;
                    indirimYas = tutarMesafe * 0.50;
                    indirimTip = (tutarMesafe - indirimYas) *0.20;
                    toplamTutar = (tutarMesafe - (indirimYas + indirimTip)) * 2;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }
                else if (12 <= yas && yas <= 24){
                    tutarMesafe = mesafe * 0.10;
                    indirimYas = tutarMesafe * 0.10;
                    indirimTip = (tutarMesafe - indirimYas) *0.20;
                    toplamTutar = (tutarMesafe - (indirimYas + indirimTip)) * 2;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }
                else if (65 <= yas){
                    tutarMesafe = mesafe * 0.10;
                    indirimYas = tutarMesafe * 0.30;
                    indirimTip = (tutarMesafe - indirimYas) *0.20;
                    toplamTutar = (tutarMesafe - (indirimYas + indirimTip)) * 2;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }else{
                    tutarMesafe = mesafe * 0.10;
                    indirimTip = tutarMesafe * 0.20;
                    toplamTutar = (tutarMesafe - indirimTip) * 2;
                    System.out.print("Ödemeniz gereken tutar: " + toplamTutar + " TL");
                }
            }
        }
        else{
            System.out.print("Hatalı veri girdiniz!");
        }
    }
}