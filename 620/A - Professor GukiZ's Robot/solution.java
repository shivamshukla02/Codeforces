import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int n1 = Math.abs(x1-x2);
        int n2 = Math.abs(y1-y2);
        System.out.print(Math.max(n1,n2));}}