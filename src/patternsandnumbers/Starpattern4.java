package patternsandnumbers;

public class Starpattern4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");// add a space for pyramid star pattern
			}
			System.out.println();
		}

	}
}
