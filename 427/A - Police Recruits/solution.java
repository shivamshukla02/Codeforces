import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int police = 0;
        int untreated = 0;
        while(n-- > 0){
            int t = sc.nextInt();
            if(t == -1){
                if(police > 0){
                    police--;} 
                else {
                untreated++;}} 
    else {
    police += t;}}
System.out.print(untreated);}}