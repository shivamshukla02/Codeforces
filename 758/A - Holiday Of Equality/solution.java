import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];}}
                int sum=0;
                for(int i=0;i<n;i++){
                    int ans = max-a[i];
                    sum+=ans;}
                System.out.print(sum);
            }
        }