package prob01;

import java.util.Scanner;

public class Sol01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		

		final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

		/* 코드 작성 */
		for (int i = 0; i < MONEYS.length; i++) {
			System.out.printf("%d 원 : %d 개 \n", MONEYS[i], money/MONEYS[i]);
			money = money % MONEYS[i];
		}
		
		scanner.close();
 	}
}