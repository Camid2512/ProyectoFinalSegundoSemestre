import java.util.Scanner;

public class Sun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ds = sc.nextInt();
		int ys = sc.nextInt();

		int dm = sc.nextInt();
		int ym = sc.nextInt();

		int anoseclipse = mcm(ym, ys) - (Math.max(dm, ds) % mcm(ym, ys));

		System.out.println(anoseclipse);
		System.out.println(mcm(ym, ys));
		System.out.println(Math.max(dm, ds) % mcm(ym, ys));

	}

	private static int mcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return mcd(b, a % b);
	}

	private static int mcm(int a, int b) {
		return (a * b) / mcd(a, b);
	}

}
