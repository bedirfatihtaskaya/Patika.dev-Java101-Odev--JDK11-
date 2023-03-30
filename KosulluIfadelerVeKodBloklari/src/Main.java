import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName ,password, process,newPassword;

        System.out.print("Kullanıcı Adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java12345") ){
            System.out.print("Başarıyla giriş yapılmıştır.");
        }
        else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış!");

            System.out.print("Şifrenizi değiştirmek ister misiniz(y/n): ");
            process = input.nextLine();

            switch (process){
                case ("y"):
                    System.out.print("Yeni  şifrenizi griniz.\nŞifreniz bir önceki şifre ile aynı olmamalıdır\n: ");
                    newPassword = input.nextLine();

                    if (newPassword == password){
                        System.out.print("Şifreniz bir önceki şifre ile aynıdır!");
                        break;
                }
                    else{
                        password = newPassword;
                        System.out.print("Şifreniz başarı ile değiştirilmiştir.");
                        break;
                }
                case ("n"):
                    System.out.print("Şifre değiştirilmedi programdan çıkılıyor...");
                    break;

                default:
                    System.out.print("Hatalı tuşlama yaptınız. Programdan çıkılıyor...");
            }

        }
    }
}