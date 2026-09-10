import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        s[0] = Character.toUpperCase(s[0]);
        System.out.print(s);
    }
}