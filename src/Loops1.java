import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k, sum=0, toplamsayi= 0;

        System.out.println("Sayi giriniz: ");
        k = input.nextInt();

        for(int i=0; i<=k; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                sum+=i;
                toplamsayi++;
            }
        }
        double ortalama = sum / toplamsayi;
        System.out.println("Ortalama: " + ortalama);
    }
}
