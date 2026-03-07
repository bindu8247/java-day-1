import java.util.*;
class Palindrome{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    void pal(){
        int temp=n;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }if(n==rev){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
            
        }
        public static void main(String args[]){
                Palindrome p=new Palindrome();
                        p.pal();
    }
    
}