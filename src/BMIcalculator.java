import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        double kg,metre,vki;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzı (metre cinsinden) giriniz: ");
        metre = input.nextDouble();
        System.out.println("Kilonuzu (kg cinsinden) giriniz: ");
        kg = input.nextDouble();
        vki = kg / (metre * metre);
        System.out.println("Vücut kitle endeksiniz: " + vki);
    }
}
