import java.util.Scanner;

public class PatternMethod {
    public static void desen(int number,int gecicinumber,int x){

        if(gecicinumber>=1 && x==0){
            gecicinumber-=5;
            System.out.println(gecicinumber+" ");
            if(gecicinumber<=0){
                desen(number,gecicinumber,1);
            }
            desen(number,gecicinumber,0);
        }
        else if(gecicinumber<=number && x==1){
            gecicinumber+=5;
            if(gecicinumber>number){
                return;
            }
            System.out.println(gecicinumber+" ");
            desen(number,gecicinumber,1);
        }
    }
    public static void main(String[] args) {

        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Number  :");
        number=scanner.nextInt();
        desen(number,number,0);




    }

}
