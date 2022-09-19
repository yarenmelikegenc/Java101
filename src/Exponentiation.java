import java.util.Scanner;

public class Exponentiation {

    static int exp(int base, int pow) {
        if (pow == 0)
            return 1;
        return base * exp(base, pow - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int base = input.nextInt();

        System.out.print("Üssü giriniz: ");
        int pow = input.nextInt();

        System.out.println("Result : " + exp(base, pow));

    }
}