package lab02;

import java.util.Scanner;

public class Bai02 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {

		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		} else {
			float x = -b / a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}

	}

	public static void main(String[] args) {
		System.out.println("Nhập số a = ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		System.out.println("Nhập số b = ");
		int b = scanner.nextInt();

		System.out.println("Nhập số c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			int delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = -b / (2 * a);
				System.out.println("nghiệm kép x = " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm riêng biệt: x1 = %.3f, x2 = %.3f", x1, x2);
			}
		}
		scanner.close();
	}
}
