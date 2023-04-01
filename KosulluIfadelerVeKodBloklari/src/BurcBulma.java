import java.util.Scanner;
public class BurcBulma{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Byte gun, ay;
        
        System.out.print("Doğduğunuz ayı giriniz(1-12): ");
        ay = input.nextByte();

        System.out.print("Doğduğunuz günü giriniz(1-31): ");
        gun = input.nextByte();

        if ((31 >= gun && gun >= 1 ) && (12 >= ay && ay >= 1)){
            if ( ay == 1){
                if (gun >= 1 && gun <= 21){
                    System.out.print("Oğlak Burcu");
                }
                else{
                    System.out.print("Kova Burcu");
                }
            }
            else if ( ay == 2){
                if (gun >= 1 && gun <= 19){
                    System.out.print("Kova Burcu");
                }
                else if (gun >=20 && gun <= 28){
                    System.out.print("Balık Burcu");
                }
                else {
                    System.out.print("Şubat ayı 28 gündür. Girdiğiniz gün sayıyı yanlıştır.");
                }
            }
            else if ( ay == 3){
                if (gun >= 1 && gun <= 20){
                    System.out.print("Balık Burcu");
                }
                else {
                    System.out.print("Koç Burcu");
                }
            }
            else if ( ay == 4){
                if (gun >= 1 && gun <= 20){
                    System.out.print("Koç Burcu");
                }
                else if (gun >=21 && gun <= 30){
                    System.out.print("Boğa Burcu");
                }
                else {
                    System.out.print("Nisan ayı 30 gündür. Girdiğiniz gün sayıyı yanlıştır.");
                }
            }
            else if ( ay == 5){
                if (gun >= 1 && gun <= 21){
                    System.out.print("Boğa Burcu");
                }
                else {
                    System.out.print("İkizler Burcu");
                }
            }
            else if ( ay == 6){
                if (gun >= 1 && gun <= 22){
                    System.out.print("İkizler Burcu");
                }
                else if (gun >=23 && gun <= 30){
                    System.out.print("Yengeç Burcu");
                }
                else {
                    System.out.print("Haziran ayı 30 gündür. Girdiğiniz gün sayıyı yanlıştır.");
                }
            }
            else if ( ay == 7){
                if (gun >= 1 && gun <= 22){
                    System.out.print("Yengeç Burcu");
                }
                else {
                    System.out.print("Aslan Burcu");
                }
            }
            else if ( ay == 8){
                if (gun >= 1 && gun <= 21){
                    System.out.print("Aslan Burcu");
                }
                else{
                    System.out.print("Başak Burcu");
                }
            }
            else if ( ay == 9){
                if (gun >= 1 && gun >= 22){
                    System.out.print("Başak Burcu");
                }
                else if (gun >= 23 && gun <= 30){
                    System.out.print("Terazi Burcu");
                }
                else {
                    System.out.print("Eylül ayı 30 gündür. Girdiğiniz gün sayıyı yanlıştır.");
                }
            }
            else if ( ay == 10){
                if (gun >= 1 && gun >= 22){
                    System.out.print("Terazi Burcu");
                }
                else{
                    System.out.print("Akrep Burcu");
                }
            }
            else if ( ay == 11){
                if (gun >= 1 && gun >= 21){
                    System.out.print("Akrep Burcu");
                }
                else if (gun >= 22 && gun >= 30){
                    System.out.print("Yay Burcu");
                }
                else {
                    System.out.print("Kasım ayı 30 gündür. Girdiğiniz gün sayıyı yanlıştır.");
                }
            }
            else if ( ay == 12){
                if (gun >= 1 && gun >= 21){
                    System.out.print("Yay Burcu");
                }
                else {
                    System.out.print("Oğlak Burcu");
                }
            }
        }
        else {
            System.out.print("Belirtilen değerler arasında gün veya ay girmediniz. Programdan çıkılıyor.");
        }
    }
}
