import java.util.Scanner;
public class UcgeninAlaniniBulanProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kenarBir,kenarIki,kenarUc;
        double u, alan;


        System.out.print("Üçgenin 1. kenarını giriniz: ");
        kenarBir = input.nextInt();

        System.out.print("Üçgenin 2. kenarını giriniz: ");
        kenarIki = input.nextInt();

        System.out.print("Üçgenin 3. kenarını giriniz: ");
        kenarUc = input.nextInt();

        u = (kenarBir + kenarIki + kenarUc) /2;
        alan = u * (u - kenarBir) * (u - kenarIki) * (u - kenarUc);

        System.out.print("Kenarlarını girmiş olduğunuz üçgenin alanı: " + alan);
    }
}
