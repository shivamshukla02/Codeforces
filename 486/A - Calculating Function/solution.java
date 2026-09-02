import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2 == 0){
            System.out.print(n/2);}
        else{
            System.out.print(-(n+1)/2);
        }}}