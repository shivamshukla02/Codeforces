import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int X=0;
        for(int i=0;i<n;i++){
            String c =sc.next();
            if(c.contains("++")){
            ++X;
        } if(c.contains("--")){
            --X;
        }
} System.out.print(X);}}
 