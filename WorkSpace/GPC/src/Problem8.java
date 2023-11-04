import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int number = sc.nextInt();
			boolean esPalindromo = true;

			String strnum = String.valueOf(number);
			int largo = strnum.length();

			for (int j = 0; j < (largo / 2); j++) {
				if (strnum.charAt(j) != strnum.charAt(largo - 1 - j)) {
					esPalindromo = false;
				} else {
					esPalindromo = true;
				}
			}
			if (esPalindromo == true) {
				System.out.println("Case " + (i + 1) + ":" + " Yes");
			} else if (esPalindromo == false) {
				System.out.println("Case " + (i + 1) + ":" + " No");

			}

		}

	}

}
