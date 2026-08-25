import java.io.*;
import java.util.*;
 
public class Main {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            String s = sc.next();
            if (s.length() > 10){
                System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
            } else {
            System.out.println(s);
        }
}
}
}