package prob03;

import java.util.Scanner;

public class Sol03 {
	
	public static void main(String[] args) {

		while(true) {
			System.out.print("수를 입력 하세요 : ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			int answer = 0;
			if (number % 2 == 0) {
				for (int i = 2; i <= number; i+=2) {
					answer += i;
				}
			}
			else {
				for (int i = 1; i <= number; i+=2) {
					answer += i;
				}
			}
			System.out.print("결과값: ");
			System.out.printf("%d\n", answer);
		}
	}
}
