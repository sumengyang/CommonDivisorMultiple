package binarytree;

import java.util.Scanner;

public class MultipleCommon {
	// 求两个最大公约数
	public static long commonDivisor(long n, long m) {
		// 辗转相除是用大的除以小的。如果n<m，第一次相当n与m值交换
		while (n % m != 0) {
			long temp = n % m;
			n = m;
			m = temp;
		}
		return m;
	}

	// 求两个数最小公倍数
	public static long commonMultiple(long n, long m) {
		return n * m / commonDivisor(n, m);
	}

	// 求多个数的最小公倍数
	public static long commonMultiple(long[] a) {
		long value = a[0];
		for (int i = 1; i < a.length; i++) {
			value = commonMultiple(value, a[i]);
		}
		return value;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			long[] a = new long[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextLong();
			}
			System.out.println(commonMultiple(a));
		}
	}
}