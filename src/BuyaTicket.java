import java.util.Scanner;

public class BuyaTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secim,km,yas,yolculukTipi;
        double normalTutar,yasİndirimi,indirimliTutar,biletİndirimi;

        System.out.println("Kaç km mesafe gideceğinizi giriniz: ");
        km = input.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipinizi seçiniz\n1-Gidiş\n2-Gidiş-Dönüş: ");
        secim = input.nextInt();
        if (km > 0 && yas > 0 ) {
            if (secim == 1 || secim == 2) {
                normalTutar = km * 0.10;
                System.out.println("Ücretinizin normal tutarı: " + normalTutar);
                if (yas < 12) {
                    System.out.println("Ücretinize %50 indirim yapılmıştır.Yeni tutar: " + (normalTutar - (normalTutar / 2)));
                } else if (yas == 12 || yas < 24) {
                    System.out.println("Ücretinize %10 indirim yapılmıştır.Yeni tutar: " + (normalTutar - (normalTutar * 0.1)));
                } else if (yas > 65) {
                    System.out.println("Ücretinize %30 indirim yapılmıştır.Yeni tutar: " + (normalTutar - (normalTutar * 0.3)));
                } else if (secim == 2) {
                    System.out.println("Ücretinize %20 indirim yapılmıştır.Yeni tutar: " + (normalTutar - (normalTutar * 0.2)));
                } else {
                    System.out.println("İndirime tabi değilsiniz. Tutar: " + normalTutar);
                }
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
