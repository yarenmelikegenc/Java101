import java.util.Scanner;

public class KdvCalculation {
    public static void main(String[] args) {
        //Değişkenleri Oluşturalım
        double ucret, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücretinizi giriniz:");
        ucret = input.nextDouble();
        double kdvTutar = ucret * kdvOran;
        double toplam = ucret + kdvTutar;
        System.out.println("Kdv tutarı eklenmiş ücretiniz: " + toplam);
    }
}
