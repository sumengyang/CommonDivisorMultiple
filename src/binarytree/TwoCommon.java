package binarytree;

import java.util.Scanner;

public class TwoCommon {
	// �����Լ��
	public static int commonDivisor(int n, int m) {
		// շת������ô�ĳ���С�ġ����n<m����һ���൱n��mֵ����
		while (n % m != 0) {
			int temp = n % m;
			n = m;
			m = temp;
		}
		return m;
	}

	// ����С������
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