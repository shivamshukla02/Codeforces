import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum=0;
        while(temp-->0){
            int p =sc.nextInt();
            sum += p;}
        double ans = (double)sum/n;
        System.out.print(ans);}}