import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double kdvoran,tutar,kdvtutar;

        System.out.print("Para giriniz: ");
        tutar = input.nextInt();

        if (tutar >= 1000){
            kdvoran = 0.8;
            kdvtutar = tutar + (tutar*kdvoran);
            System.out.println("Kdvsiz tutar: " + tutar);
            System.out.print("Kdvli Tutar: " + kdvtutar);

        }
        else if (tutar <1000 && tutar >= 0){
            kdvoran = 0.18;
            kdvtutar = tutar + (tutar*kdvoran);
            System.out.println("Kdvsiz tutar: " + tutar);
            System.out.print("Kdvli Tutar: " + kdvtutar);
        }
        else {
            System.out.print("Lütfen geçerli bir tutar giriniz...!");
        }
    }
}
