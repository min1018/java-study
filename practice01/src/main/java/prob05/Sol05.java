package prob05;

public class Sol05 {
	public static void main(String[] args) {

		/* 코드 작성 */
		char[] ans = {'3', '6', '9'};
		for(int i = 1; i < 101; i++) {
			String temp = Integer.toString(i);
			int flag = 0;
			for(int k = 0; k <temp.length(); k ++) {
				for (int t = 0; t < 3; t++) {
					if (temp.charAt(k) == ans[t]) {
						flag += 1;
					}	
				}
			}
			if(flag > 0) {
				System.out.print(i);
				System.out.println("짝".repeat(flag));
			}
		}
	}
}
