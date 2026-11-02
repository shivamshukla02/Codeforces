import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
        long n = sc.nextLong();
        long ans = (n-1)/2;
        System.out.println(ans);   
       }}}