package javapractice;

import java.util.Scanner;

public class MatrixRotate {
	
	public static void printMatrix(int[][] matrix) {
		System.out.println("**********");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number of matrix size:");
		int n = scanner.nextInt();
		
		
		int[][] matrix = new int[n][n];
		System.out.println("Enter Matrix data:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		printMatrix(matrix);
	
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				int[][] temp = matrix;
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = matrix[i][j];
			}
			
		}
		
		printMatrix(matrix);
		
		for(int[] row: matrix) {
			
		}

	}

}
