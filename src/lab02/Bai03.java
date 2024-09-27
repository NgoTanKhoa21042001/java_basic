package lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
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
}
