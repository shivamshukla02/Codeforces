import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
 
        int c = 1;
        while (n > 5 * c) {
            n = n - 5 * c;
            c = c * 2;
        }
 
    System.out.println(names[(n - 1) /c]);}}
 