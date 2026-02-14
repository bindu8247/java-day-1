import java.util.*;
public class leapyear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%4==0){
            System.out.println("given year is a leap year");
        }else if(a%400==0){
            System.out.println("given year is a leap year");
        }else{
            System.out.println("given number is not a leap year");
        }
    }
}
