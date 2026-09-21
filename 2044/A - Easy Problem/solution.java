import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int c=0;
            int n = sc.nextInt();
            for(int i =1;i<n;i++){
                for(int j=1;j<n;j++){
                    if(i+j == n){
                        c++;}}}
            System.out.println(c);}}}