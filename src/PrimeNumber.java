import java.util.Scanner;

public class PrimeNumber {

    static boolean asal(int n, int j){

        if(n == j)
            return true;

        if(n % j == 0)
            return false;

        return asal(n, j + 1);
    }


    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        x = input.nextInt();
        System.out.print(asal(x,2) ? x + " sayısı asaldır." : x + " sayısı asal değildir." );
    }
}