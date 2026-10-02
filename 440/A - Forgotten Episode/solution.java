import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] =new long[n];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextLong();}
        long sum1 = (long) n * (n + 1) / 2;
        long sum2 = 0;
        for(int i=0;i<n-1;i++){
            sum2 += a[i];}
        System.out.print(sum1-sum2);}}
 