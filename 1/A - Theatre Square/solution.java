import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long lengthCount = n / a;
        if (n % a != 0) {
            lengthCount = lengthCount + 1;
        }
    long breadthCount = m / a;
    if (m % a != 0) {
        breadthCount = breadthCount + 1;
    }System.out.println(lengthCount*breadthCount);}}