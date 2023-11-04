import java.util.Scanner;

public class SavingTaxes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int result = x - y;
			System.out.println(result);
		}
	}
}