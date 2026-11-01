import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc =new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
          int n = sc.nextInt();
          String s = sc.next();
          int x =0;
          for(int i=s.length()-1;i>=0;i--){
              if(s.charAt(i)==')'){
                  x++;
              }
              else{
                  break;
              }
          }
          if(x>n-x){
              System.out.println("Yes");
          }
          else{
              System.out.println("No");
          }          
      }}}