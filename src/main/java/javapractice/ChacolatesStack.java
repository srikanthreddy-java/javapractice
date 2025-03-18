package javapractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ChacolatesStack {

	public static void solve(int N, int[] C) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> soldChocolates = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            if (C[i] == 0) {
                if (!stack.isEmpty()) {
                    soldChocolates.add(stack.pop());
                }
            } else {
                stack.push(C[i]);
            }
        }
        
        System.out.println(soldChocolates);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        scanner.close();
        
        solve(N, C);
    }
}
