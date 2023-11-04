import java.util.Scanner;

public class Fitness {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			int x = sc.nextInt();
			int result = (x + x) * 5;
			System.out.println(result);

		}

	}
}