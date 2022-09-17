import java.awt.*;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userName, password;
        int kalanHak= 3;
        int bakiye=2000;

        while (kalanHak > 0){
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev")) {
                System.out.println("Hesabınıza giriş yaptınız. ");
                System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sergulama\n4-Çıkış Yap" );
                System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                int secim = input.nextInt();

                switch (secim) {
                    case 1:
                        System.out.println("Yatıracağınız tutarı giriniz: ");
                        int yatırılacakPara = input.nextInt();
                        System.out.println("Hesap Bakiyesi: " + (bakiye + yatırılacakPara));
                        bakiye = bakiye - yatırılacakPara;
                        break;
                    case 2:
                        System.out.println("Çekeceğiniz tutarı giriniz: ");
                        int cekilecekPara = input.nextInt();
                        if (cekilecekPara > bakiye){
                            System.out.println("Yetersiz Bakiye!");
                        } else {
                            System.out.println("Hesap Bakiyesi: " + (bakiye - cekilecekPara));
                            bakiye = bakiye - cekilecekPara;
                        }
                        break;
                    case 3:
                        System.out.println("Güncel Bakiyeniz: " + bakiye);
                        break;
                    case 4:
                        System.out.println("Çıkış yaptınız.");
                        break;
                }
            } else {
                if (kalanHak == 0) {
                    System.out.println("Hesabınız bloke edilmiştir.Bankayla iletişime geçiniz.");
                } else{
                    kalanHak--;
                    System.out.println("Hatalı giriş yaptınız");
                    System.out.println("Kalan deneme hakkınız: " + kalanHak);
                }
            }
        }
    }
}
