import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int dig=temp%10;
            sum=sum+dig*dig*dig;
            temp=temp/10;
        }
        if (num==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("not a armstrong");
        }
    }
}
