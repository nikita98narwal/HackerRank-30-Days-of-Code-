package HackerRank;

import java.util.Scanner;

public class Day1 {

	public static void main(String args[]) {
		int i1 = 4;
		double d1 = 4.0;
		String s1 = "HackerRank";
		
		Scanner scan = new Scanner(System.in);
		int i2;
		double d2;
		String s2;
		i2 = scan.nextInt();
		d2 = scan.nextDouble();
		scan.nextLine();// read the rest of the line of input (newline character after the double token).
		s2 = scan.nextLine();
		
		System.out.println(i1 + i2);
		System.out.println(d1 + d2);
		System.out.println(s1 + s2);
		scan.close();
	}
}
