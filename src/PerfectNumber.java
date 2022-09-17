import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();

        for ( int i = 1; i < number; i++){
            if (number%i == 0){
                sum += i;
            }
        }
        if (sum == number){
            System.out.println(number + " mükemmel sayıdır.");
        } else{
            System.out.println(number + " mükemmel sayı değildir.");
        }

    }
}
