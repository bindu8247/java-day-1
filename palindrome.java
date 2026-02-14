import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    
}
