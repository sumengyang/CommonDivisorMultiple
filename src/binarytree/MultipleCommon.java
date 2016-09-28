package binarytree;

import java.util.Scanner;

public class MultipleCommon {
	// ���������Լ��
	public static long commonDivisor(long n, long m) {
		// շת������ô�ĳ���С�ġ����n<m����һ���൱n��mֵ����
		while (n % m != 0) {
			long temp = n % m;
			n = m;
			m = temp;
		}
		return m;
	}

	// ����������С������
	public static long commonMultiple(long n, long m) {
		return n * m / commonDivisor(n, m);
	}

	// ����������С������
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