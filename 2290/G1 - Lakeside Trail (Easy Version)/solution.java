import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            long k = sc.nextLong();
 
            int[] h = new int[n];
 
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }
 
        long low = 0;
        long high = 0;
 
        
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
 
            high = Math.max(high,
            Math.abs((long) h[i] - h[next]));
        }
 
    while (low < high) {
 
        long mid = low + (high - low) / 2;
 
        long soil = 0;
 
        
        for (int i = 0; i < n; i++) {
 
            long required = h[i];
 
            for (int j = 0; j < n; j++) {
 
                int diff = Math.abs(i - j);
                int distance = Math.min(diff, n - diff);
 
                long height = h[j] - mid * distance;
 
                required = Math.max(required, height);
            }
 
        soil += required - h[i];
 
        if (soil > k) {
            break;
        }
}
 
if (soil <= k) {
    high = mid;
} else {
low = mid + 1;
}
}
 
System.out.println(low);
}
 
sc.close();
}
}