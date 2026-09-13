import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.min(a,b);
        int d =(Math.max(a, b) - c) / 2;
 
        System.out.print(c+" "+d);}}