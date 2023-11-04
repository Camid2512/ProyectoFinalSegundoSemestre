import java.util.Scanner;

public class TriangleWave {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			if (i > 0) {
				System.out.println();
			}

			int a = sc.nextInt();
			int f = sc.nextInt();

			for (int j = 0; j < f; j++) {
				if (j > 0) {
					System.out.println();
				}
				for (int j2 = 1; j2 <= a; j2++) {
					for (int k = 0; k < j2; k++) {
						System.out.print(j2);
					}
					System.out.println();
				}
				for (int j2 = (a - 1); j2 >= 1; j2--) {
					for (int k = 0; k < j2; k++) {
						System.out.print(j2);
					}
					System.out.println();

				}
			}

		}
	}
}
