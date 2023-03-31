import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Byte heat;

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextByte();

        System.out.println("Girdiğiniz sıcaklığa göre neler yapabilirsiniz\n");
        if (heat <=
                5 ){
            System.out.println("Kayak yapabilirsiniz");
        }
        if (heat >= 5 && heat <= 20){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        if (heat >= 15 && heat <= 25){
            System.out.println("Müzeleri gezebilirsiniz");
            System.out.println("Resim yapabilirsiniz");
        }
        if (heat >= 20 && heat <= 25){
            System.out.println("Piknik  yapabilirsiniz");
            System.out.println("Kamp yapabilirsiniz");
        }
        if (heat >= 20 && heat <= 30){
            System.out.println("Bisiklet sürebilirsiniz");
            System.out.println("Doğa yürüyüşü yapabilirsiniz");
            System.out.println("Spor yapabilirsiniz");
        }
        if (heat >= 30 ){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
