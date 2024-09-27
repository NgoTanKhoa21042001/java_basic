package lab02;

import java.util.Scanner;

public class Bai04 {
//	System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//	System.out.println("++ ----------------------------------------- ++");
//	System.out.println("| 1. Giải phương trình bậc nhất |");
//	System.out.println("| 2. Giải phương trình bậc hai |");
//	System.out.println("| 3. Tính số tiền điện |");
//	System.out.println("| 4. Kết thúc |");
//	System.out.println("++ ------------------ ++");

	public static void bai01() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số a = ");
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

	public static void bai02() {
		System.out.println("Nhập số a = ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		System.out.println("Nhập số b = ");
		int b = scanner.nextInt();

		System.out.println("Nhập số c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			// giải pt bậc nhất
			System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

			if (a == 0 && b == 0) {
				System.out.println("phương trình có vô số nghiệm");
			} else if (a == 0 && b != 0) {
				System.out.println("phương trình vô nghiệm");
			} else {
				float x = -b / a;
				System.out.println("Phương trình có nghiệm x = " + x);
			}

		} else {
			// giải pt bậc 2
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

	// số tiền điện

	public static void bai03() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính tiền điện");
		System.out.println("Nhập số điện");
		int soDien = scanner.nextInt();

		if (soDien > 0 && soDien <= 100) {
			int money = soDien * 1000;
			System.out.println("Số tiền điện = " + money);
		} else {
			int money = 100 * 1000 + (soDien - 100) * 1500;
			System.out.println("Số tiền điện = " + money);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lựa chọn của bạn là : ");

		int value = scanner.nextInt();

		switch (value) {
		case 1: {
			bai01();
			break;
		}
		case 2: {
			bai02();
			break;
		}
		case 3: {
			bai03();
			break;
		}
		default:
			System.out.println("Bạn đã lựa chọn thoát chương trình");
			System.exit(0);

		}
		scanner.close();
	}
}
