import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String reversed = new StringBuilder(t).reverse().toString();
        if(s.equals(reversed)){
            System.out.print("YES");
        } else{
        System.out.print("NO");
    }}}