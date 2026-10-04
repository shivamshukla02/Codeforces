import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[5][5];
        int m=0,n=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j] == 1){
                    m=i;n=j;}}}
        System.out.print(Math.abs(m-2)+Math.abs(n-2));}}