package HackerRank;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();			
		}
		for(int  i = (A.length-1); i >= 0; i--) {
			System.out.print(A[i] +" ");
		}
		

	}

}
