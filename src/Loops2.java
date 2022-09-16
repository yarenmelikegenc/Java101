import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, sum = 0;
        do {
            System.out.println("Bir sayi giriniz: ");
            k = input.nextInt();
            if ((k % 2 == 0) && (k % 4 == 0)) {
                sum += k;
            }
        } while (k % 2 == 0);
        System.out.println("Girdiğiniz sayılardan çift ve 4'e bölünen sayıların toplamı: " + sum);
    }
}
