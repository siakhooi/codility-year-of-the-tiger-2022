package nsh.codility;

import java.util.ArrayList;

public class YearOfTheTiger2022B1 implements YearOfTheTiger2022Interface {

	ArrayList<String> swaps(String t) {
		ArrayList<String> a = new ArrayList<>();
		a.add(t);
		a.add(String.format("%s%s%s", t.charAt(1), t.charAt(0), t.charAt(2)));
		a.add(String.format("%s%s%s", t.charAt(0), t.charAt(2), t.charAt(1)));
		return a;
	}

	public int solution(String[] T) {
		int R = 0;

		for (String t : T)
			for (String cand : swaps(t)) {
				int cnt = 0;

				for (String s : T)
					if (swaps(s).contains(cand))
						cnt++;

				R = Math.max(R, cnt);
			}

		return R;
	}
}
