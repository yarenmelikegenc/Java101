import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int k, i=1 ;
        double sonuc=0 ;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        k = input.nextInt();

        while (i <= k) {
            sonuc += (1/i);
            i++;
        }
        System.out.println(sonuc);
    }
}
