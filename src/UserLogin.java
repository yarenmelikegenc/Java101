import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String sifre, kullaniciAdi, secim, yenisifre;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("Patika") && sifre.equals("Dev")) {
            System.out.println("Sisteme başarıyla giriş yaptınız.");
        } else {
            System.out.println("Girilen sifre yanlıştır. Sifrenizi sıfırlamak ister misiniz?");
            secim = input.nextLine();
            if (secim.equals("evet")) {
                System.out.println("Yeni şifrenizi giriniz: ");
                yenisifre = input.nextLine();
                if (yenisifre.equals("Dev") || yenisifre.equals(sifre)) {
                    System.out.println("Yeni şifreniz eski şifrenizden ve yanlış girdiğiniz şifreden farklı olmalıdır!");
                } else {
                    System.out.println("Şifreniz başarıyla güncellenmiştir.");
                }
            } else {
                System.out.println("Ana sayfaya dönüş yapıyorsunuz.");
            }
        }
    }
}
