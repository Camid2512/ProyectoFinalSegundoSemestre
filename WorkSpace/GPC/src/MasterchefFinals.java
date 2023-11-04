import java.util.Scanner;

public class MasterchefFinals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int x = sc.nextInt();

			String result = "YES";
			if (x <= 10) {
				System.out.println(result);
			} else {
				result = "NO";
				System.out.println(result);
			}

		}

	}

}
