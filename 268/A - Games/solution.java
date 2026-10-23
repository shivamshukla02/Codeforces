import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
 
        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int a = sc.nextInt();
            list1.add(h);
            list2.add(a);
        }
 
    int c = 0;
    for(int i = 0; i < list1.size(); i++) {
        for(int j = 0; j < list2.size(); j++) {
            if(i != j && list1.get(i).equals(list2.get(j))) {
                c++;
            }
    }
}
 
System.out.println(c);
}
}