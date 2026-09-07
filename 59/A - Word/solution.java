import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                a++;
            } else{
            b++;}}
    if(a>b){
        System.out.print(s.toUpperCase());}
else{
    System.out.print(s.toLowerCase());}}}