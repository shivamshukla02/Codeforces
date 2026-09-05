import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i <= t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int c=0;
            for(int j=0;j<n;j=j+k){
                boolean one = true;
                for(int l =j;l<j+k;l++){
                    if(s.charAt(l)=='0'){
                        one=false;
                        break;}}
                if(one){
                    c++;}}
                System.out.println(c);}
            }
        }