import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Sc = new Scanner(System.in);
        String s = Sc.next().toLowerCase();
        if((s.chars().distinct().count())%2 == 0){
            System.out.print("CHAT WITH HER!");
        } else{
        System.out.print("IGNORE HIM!");
    }}}
 