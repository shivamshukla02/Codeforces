import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int s =0;
        for(int i=1;i <= w;i++){
            s=s+(i*k);}
        int m = s-n;
        if (m< 0) {
            System.out.print("0");}
        else{
            System.out.print(m);}}}