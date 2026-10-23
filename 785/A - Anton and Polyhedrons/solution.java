import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int faces=0;
        while(n-->0){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                faces += 4;
            }
        else if(s.equals("Cube")){
            faces += 6;
        }
    else if(s.equals("Octahedron")){
        faces += 8;
    }
else if(s.equals("Icosahedron" )){
    faces += 20;
}
else{
    faces += 12;}}
System.out.print(faces);}}