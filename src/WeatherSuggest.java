import java.util.Scanner;

public class WeatherSuggest {
    public static void main(String[] args) {
        double derece;

        Scanner input = new Scanner(System.in);

        System.out.println("Hava sıcaklığını (derece cinsinden) giriniz: ");
        derece = input.nextDouble();

        if (derece < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (derece == 5 || derece < 15) {
            System.out.println("Sinema yapabilirsiniz.");
        } else if (derece == 15 || derece < 20) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (derece > 20) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        } else {
            System.out.println("Yanlış giriş yaptınız.");
        }
    }
}
