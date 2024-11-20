package prob02;

import java.util.Scanner;

public class Sol02 {
	public static void main(String[] args) {
		System.out.println("5개의 숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[5];
		double sum = 0;

		/* 코드 작성 */
		for(int i = 0; i< 5; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		
		System.out.printf("평균은 %.1f 입니다.",sum/5);
		scanner.close();
	}
}
