import java.util.Scanner;


public class leapyear {
    public static boolean leapyear(int year){
        if(year<=0){
            return false;
        }
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is a Leap year!");
            return true;
        }
        System.out.println(year+" is not a leap year!");
        return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        //int n = 2023;
        //leapyear(n);
        leapyear(year);
    }
}
