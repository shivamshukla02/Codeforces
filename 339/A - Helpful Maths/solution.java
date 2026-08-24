import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i < s.length(); i++){
            char sum = s.charAt(i);
            if(sum == '1'){
                count1++;
            } else if(sum == '2'){
            count2++;
        } else if(sum == '3'){
        count3++;}}
StringBuilder p = new StringBuilder();
for(int i = 0; i < count1; i++){
    p.append("1+");}
for(int i = 0; i < count2; i++){
    p.append("2+");}
for(int i = 0; i < count3; i++){
    p.append("3+");}
p.deleteCharAt(p.length() - 1);
System.out.print(p);}}