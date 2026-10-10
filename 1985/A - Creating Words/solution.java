import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
 
            char temp1 = a.charAt(0);
            char temp2 = b.charAt(0);
 
            String c = temp2 + a.substring(1);
            String d = temp1 + b.substring(1);
 
            System.out.println(c + " " + d);
        }
}
}