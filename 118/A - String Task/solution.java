import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            continue;
            } else {
            sb.append('.').append(ch);
        }
}
System.out.print(sb);}}
 