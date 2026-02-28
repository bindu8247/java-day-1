import java.util.*;
public class stringmethods {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("length:"+s.length());
        System.out.println("ignorecase:"+s.equalsIgnoreCase("jAva"));
        System.out.println("contains:"+s.contains("java"));
        System.out.println("substring:"+s.substring(4));
        System.out.println("uppercase:"+s.toUpperCase());
        System.out.println("lowercase:"+s.toLowerCase());
        System.out.println("charat:"+s.charAt(6));
        System.out.println("equals:"+s.equals("wel"));
        System.out.println("lastindexof:"+s.lastIndexOf("to"));

    }
}
