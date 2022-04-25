package nsh.codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class YearOfTheTiger2022B2 implements YearOfTheTiger2022Interface {

	ArrayList<String> swaps(String t) {
		ArrayList<String> a = new ArrayList<>();
		a.add(t);
		a.add(String.format("%s%s%s", t.charAt(1), t.charAt(0), t.charAt(2)));
		a.add(String.format("%s%s%s", t.charAt(0), t.charAt(2), t.charAt(1)));
		return a;
	}

	public int solution(String[] T) {
		int R = 0;
		Map<String, Integer> occ = new HashMap<>();
		for (String t : T)
			occ.put(t, occ.containsKey(t) ? occ.get(t) + 1 : 1);

		for (String t : T)
			for (String cand : swaps(t)) {
				int cnt = 0;

				for (String s : swaps(cand).stream().distinct().collect(Collectors.toList()))
					cnt += occ.containsKey(s) ? occ.get(s) : 0;


				R = Math.max(R, cnt);
			}

		return R;
	}
}
