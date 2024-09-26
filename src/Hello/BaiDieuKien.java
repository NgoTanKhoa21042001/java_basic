package Hello;

import java.util.Scanner;

public class BaiDieuKien {
	public static void main(String[] args) {
//		- dưới 10M: không đóng thuế
//		- từ 10M tới 15M: thuế 10%
//		- từ 15 tới 30M : thuế 20%
//		- trên 30M: thuế 50%
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tax = ");
		int tax = scanner.nextInt();
		if (tax < 10) {
			System.out.println("Không đóng thuế");
		} else if (tax >= 10 && tax <= 15) {
			System.out.println("Thuế 10%");
		} else if (tax >= 15 && tax <= 30) {
			System.out.println("Thuế 20%");
		} else {
			System.out.println("Thuế 50%");
		}
	}
}
