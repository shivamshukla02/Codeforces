import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c=0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i) == sb.charAt(i+1)){
                c++;}}
        System.out.print(c);}}