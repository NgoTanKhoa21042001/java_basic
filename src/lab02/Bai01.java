package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Nhập số a = ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		System.out.println("Nhập số b = ");
		int b = scanner.nextInt();

		System.out.println("Giải phương trình bậc nhất");

		if (a == 0 && b == 0) {
			System.out.println("phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		} else {
			float x = -b / a;
			System.out.printf("Phương trình có nghiệm x = " + x);
		}
		scanner.close();
	}
}
