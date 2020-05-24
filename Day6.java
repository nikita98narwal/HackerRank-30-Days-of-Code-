package HackerRank;
import java.util.Scanner;

public class Day6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			
			String s = sc.nextLine();
			char[] arr = s.toCharArray();
			for(int j = 0; j < arr.length; j++) {
					if(j%2 == 0) {
						System.out.print(arr[j]);
					}
			}
			System.out.print(" ");
			for(int j = 0; j< arr.length; j++)
			{
				if(j%2 != 0)
				{
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
