import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
 
            if (Math.abs(x) < min) {
                min = Math.abs(x);
            }
    }
 
System.out.println(min);
}
}