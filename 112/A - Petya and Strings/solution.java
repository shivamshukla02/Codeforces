import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int c = 0;
 
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                c++;
            } else if (s1.charAt(i) < s2.charAt(i)) {
            System.out.print("-1");
            return;
        } else {
        System.out.print("1");
        return;
    }
}
 
if (c == s1.length()) {
    System.out.print("0");
}
}
}