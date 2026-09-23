import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sum=0;
            int n =  sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();}
            for(int i=0;i<n;i++){
                sum += a[i];}
            if (sum == n) {
                System.out.println(0);
            } else if (sum < n) {
            System.out.println(1);
        } else {
        System.out.println(sum - n);}}}}