package prob05;

public class Sol05 {
	public static void main(String[] arg) {

		int array[] = {5, 9, 3, 8, 60, 20, 1};
		int count = array.length;

		System.out.println("Before Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

		Bubble(array);
		

		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void Bubble(int[] array) {
		// TODO Auto-generated method stub
		for(int i = array.length-1; i > 0; i--) {
			for (int k = 0; k < i; k++) {
				if (array[k] < array[k+1]) {
					int temp = array[k+1];
					array[k+1] = array[k];
					array[k] = temp;
				}
			}
		}
		
	}
}