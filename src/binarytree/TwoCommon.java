package binarytree;

import java.util.Scanner;

public class TwoCommon {
	// 求最大公约数
	public static int commonDivisor(int n, int m) {
		// 辗转相除是用大的除以小的。如果n<m，第一次相当n与m值交换
		while (n % m != 0) {
			int temp = n % m;
			n = m;
			m = temp;
		}
		return m;
	}

	// 求最小公倍数
	public static int commonMultiple(int n, int m) {
		return n * m / commonDivisor(n, m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(commonMultiple(n, m));
		System.out.println(commonDivisor(n, m));
	}
}