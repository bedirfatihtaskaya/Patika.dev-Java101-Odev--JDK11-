import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0){
            if (yil %100 == 0){
                if (yil % 400 == 0){
                    System.out.print(yil + " yılı artık yıldır");
                }
                else {
                    System.out.print(yil + " yılı artık yıl değildir!");
                }
            }
            else {
                System.out.print(yil + " yılı artık yıldır");
            }
        }
        else {
            System.out.print(yil + " yılı artık yıl değildir!");
        }
    }
}
