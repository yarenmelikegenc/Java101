package Giriş;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Değişkenleri oluşturduk
        int mat, fizik, kimya, turkce, tarih, muzik;
        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan değer alalım.
        System.out.print("Matematik notunuzu giriniz:");
        mat= inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik= inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya= inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce= inp.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        tarih= inp.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik= inp.nextInt();

        double ortalama= (mat+fizik+kimya+tarih+turkce+muzik)/6;
        System.out.println(ortalama);
        String sonuc;
        sonuc = (ortalama > 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız: "+ortalama+"\nGeçme Durumu: "+sonuc);

    }
}

