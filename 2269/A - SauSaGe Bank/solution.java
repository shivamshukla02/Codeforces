import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long fastmoney = (k-1)*2L;
            int remaining = n-(k-1);
            long finalmoney = 1L<<remaining;
            System.out.println(fastmoney + finalmoney);}
            }}