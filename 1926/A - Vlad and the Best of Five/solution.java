import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int a = 0;
            int b = 0;
            String s = sc.next();
 
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    a++;
                } else {
                b++;
            }
    }
 
if (a > b) {
    System.out.println('A');
} else {
System.out.println('B');
}
}
}
}