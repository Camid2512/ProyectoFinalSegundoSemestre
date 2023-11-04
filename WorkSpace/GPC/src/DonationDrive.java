import java.util.Scanner;

public class DonationDrive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int x = sc.nextInt();
			int n = sc.nextInt();

			int result = x - n;

			System.out.println(result);

		}

	}

}
