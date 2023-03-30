import java.util.Scanner;
public class DaireninAlaniniVeCevresiniHesaplayanProgram {
    public static void main(String[] args){
        double aci,yaricap,alan,pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        yaricap = input.nextDouble();

        System.out.print("Açıyı giriniz: ");
        aci = input.nextDouble();

        alan = (pi * (yaricap * yaricap) * aci)/360;
        System.out.print("Yarıçapı " + yaricap + ", açısı " + aci + " derece olan dairenin alanı: " + alan);
    }
}