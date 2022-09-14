import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int secim, sayi1, sayi2;
        Scanner input= new Scanner(System.in);
        System.out.println("İşlem yapmak istediğiniz birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.println("İşlem yapmak istediğiniz ikinci sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.println("Hangi işlemi yapmak istediğinizi seçin: ");
        secim = input.nextInt();
        if (secim == 1){
            System.out.println("Toplama işleminizin sonucu: " + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("Çıkarma işleminizin sonucu: " + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("Çarpma işleminizin sonucu: " + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("Bölme işleminizin sonucu: " + (sayi1 / sayi2));
        } else {
            System.out.println("Yanlış seçim yaptınız!");
        }
    }
}
