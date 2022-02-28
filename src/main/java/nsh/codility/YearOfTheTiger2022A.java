package nsh.codility;

public class YearOfTheTiger2022A implements YearOfTheTiger2022Interface {

	public int solution(String[] T) {
		int R = 1;

		int i[][][] = new int[26][26][26];
		for (int j = 0; j < T.length; j++) {
			char[] c = T[j].toCharArray();
			c[0] -= 'a';
			c[1] -= 'a';
			c[2] -= 'a';
			i[c[0]][c[1]][c[2]]++;
			if (c[0] != c[1])
				i[c[1]][c[0]][c[2]]++;
			if (c[1] != c[2])
				i[c[0]][c[2]][c[1]]++;
			R = Math.max(R, i[c[0]][c[1]][c[2]]);
			R = Math.max(R, i[c[1]][c[0]][c[2]]);
			R = Math.max(R, i[c[0]][c[2]][c[1]]);
		}

		return R;
	}
}
