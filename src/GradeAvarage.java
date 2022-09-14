import java.util.Scanner;

public class GradeAvarage {
    public static void main(String[] args){
        //Değişkenleri oluşturduk
        int mat, fizik, kimya, turkce, tarih, muzik;
        //Scanner sınıfımızı tanımladık
        Scanner input =new Scanner(System.in);
        //Kullanıcıdan değer alalım.
        System.out.print("Matematik notunuzu giriniz:");
        mat= input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik= input.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya= input.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce= input.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        tarih= input.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik= input.nextInt();

        double ortalama= (mat+fizik+kimya+tarih+turkce+muzik)/6;
        System.out.println(ortalama);
        String sonuc;
        sonuc = (ortalama > 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız: "+ortalama+"\nGeçme Durumu: "+sonuc);

    }
}





