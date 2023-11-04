import java.util.Scanner;

public class IPLTicketRush {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int result = n - m;
			if (result < 0) {
				System.out.println(0);
			} else {
				System.out.println(result);
			}

		}

	}

}
