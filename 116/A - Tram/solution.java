import java.io.*;
import java.util.*;
 
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
 
        int max = 0;
        int current = 0;
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            current = current - a + b; 
 
            if (current > max) {
                max = current; 
            }
    }
 
System.out.println(max); 
}
}