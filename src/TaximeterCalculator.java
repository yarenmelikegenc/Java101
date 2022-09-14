import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        double acilisUcret=10, km=2.20, toplamkm, toplamUcret;
        Scanner input= new Scanner(System.in);
        System.out.println("Kaç km yol gittiniz?: ");
        toplamkm = input.nextDouble();
        toplamUcret = acilisUcret + (toplamkm*km);
        toplamUcret = (toplamUcret < 20) ? 20 : toplamUcret;
        System.out.println("Ucretiniz: " + toplamUcret);
    }
}
