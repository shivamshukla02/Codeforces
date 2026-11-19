import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        while (t1-- > 0) {
            String s = sc.next();
            int count0 = 0;
            int count1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') count0++;
                else count1++;}
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (count1 == 0) break; 
                count1--;} 
            else {
            if (count0 == 0) break; 
            count0--;               }}
System.out.println(count0 + count1);}}}