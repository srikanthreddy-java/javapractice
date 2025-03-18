package javapractice;

import java.util.Scanner;

public class BalancedMixture {
    
    static long combination(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    
    public static long Balanced(int A, int B, int C) {
        long count = 0;
        for (int powerful = 4; powerful <= Math.min(A, C - 1); powerful++) {
            int weak = C - powerful;
            if (weak >= 1 && weak <= B) {
                count += combination(A, powerful) * combination(B, weak);
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();
        
        System.out.println(Balanced(A, B, C));
    }
}
