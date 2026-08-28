import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h  = sc.nextInt();
        int a[] = new int[n];
        int w=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}
        for(int i=0;i<n;i++){
            if(a[i]<=h){
                w++;}
                else{
                    w=w+2;}}
                    System.out.print(w);}}
                    