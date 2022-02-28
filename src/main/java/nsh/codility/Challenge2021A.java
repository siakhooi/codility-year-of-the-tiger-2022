package nsh.codility;

public class Challenge2021A implements Challenge2021Interface {

	public int solution(int[] A, int L, int R) {
		int N = A.length;

		return N;
	}

	// -----------------------------------------
	static void pf(String f, Object... v) {
		System.out.printf(f, v);
		System.out.println("");
	}

	public static void main1(String argv[]) {
		int[] A = new int[] { 2, 3, 3, 4 };
		int L = 3;
		int R = 1;
		int E = 3;

		int R1 = (new Challenge2021A()).solution(A, L, R);
		pf("     K: %d", L);
		pf("    in: %s", R);
		pf("   out: %s", R1);
		pf("expect: %s", E);
		pf("Result: %s", (R1 == E) ? "good" : "bad");
	}
	// java -cp target/classes nsh.codility.Challenge2021A
}
