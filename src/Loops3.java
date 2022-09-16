import java.util.Scanner;

public class Loops3 {

    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı girin :");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4 un katlari :" + i);

        }
        System.out.println("------------------");
        for (int i=1;i<=n;i*=5){
            System.out.println("5'in kati: "+i);

        }
    }
}
