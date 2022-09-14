import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        double r, pi= 3.14, alan, cevre;
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        r = input.nextDouble();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin alanı: " + alan);
    }
}
