import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            char initial = 'R';
            int c = 0;
 
            for (int i = 0; i < s.length(); i++) {
                char requiredColor = s.charAt(i);
 
                if (requiredColor != initial) {
                    c++;
                }
 
            if (requiredColor == 'R') {
                initial = 'B';
            } else {
            initial = 'R';
        }
}
 
 
System.out.println(c);
}
}
}