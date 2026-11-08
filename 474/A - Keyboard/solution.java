import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String k = sc.next();
        StringBuilder sb = new StringBuilder();
        if(s.equals("L")){
            for(int i=0;i<k.length();i++){
                for(int j=0;j<p.length();j++){
                    if(k.charAt(i) == p.charAt(j)){
                        sb.append(p.charAt(j+1));}}}}
        else{
            for(int i=0;i<k.length();i++){
                for(int j=0;j<p.length();j++){
                    if(k.charAt(i) == p.charAt(j)){
                        sb.append(p.charAt(j-1));}}}}
        System.out.print(sb);
    }}