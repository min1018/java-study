package prob02;

public class Sol02 {
	public static void main(String[] args) {
		int cnt = 10;
		for (int i = 1; i <= 9; i++) {
			System.out.print("1 2 3 4 5 6 7 8 9 ");
			for (int k = 10; k <= cnt; k++) {
				System.out.printf("%d ", k);
			}
			System.out.println();
			cnt += 1;
		}
	
	}
}