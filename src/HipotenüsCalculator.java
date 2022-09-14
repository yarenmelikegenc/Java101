import java.util.Scanner;

public class HipotenüsCalculator {
    public static void main(String[] args) {
        //Değişkenleri Oluşturalım
        double birinciKenar,ikinciKenar,hipotenüs;
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz: ");
        birinciKenar = input.nextDouble();
        System.out.println("İkinci kenarı giriniz:");
        ikinciKenar = input.nextDouble();
        hipotenüs =Math.sqrt((birinciKenar * birinciKenar) + (ikinciKenar * ikinciKenar));
        System.out.println("Hipotenüs: "+ hipotenüs);
    }

}
