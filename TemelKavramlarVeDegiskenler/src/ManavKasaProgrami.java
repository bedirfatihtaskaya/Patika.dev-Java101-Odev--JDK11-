// www.patika.dev
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5 , toplam = 0 ;
        int kilo;

        System.out.print("Kaç kilogram armut istiyorsunuz: ");
        kilo = input.nextInt();
        toplam = toplam + (kilo * armut);

        System.out.print("Kaç kilogram elma istiyorsunuz: ");
        kilo = input.nextInt();
        toplam = toplam + (kilo * elma);

        System.out.print("Kaç kilogram domates istiyorsunuz: ");
        kilo = input.nextInt();
        toplam = toplam + (kilo * domates);

        System.out.print("Kaç kilogram muz istiyorsunuz: ");
        kilo = input.nextInt();
        toplam = toplam + (kilo * muz);

        System.out.print("Kaç kilogram patlıcan istiyorsunuz: ");
        kilo = input.nextInt();
        toplam = toplam + (kilo * patlican);

        System.out.print("Toplam tutar: " + toplam);


    }
}
