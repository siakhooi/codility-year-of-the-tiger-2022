package nsh.codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class YearOfTheTiger2022B3 implements YearOfTheTiger2022Interface {

	ArrayList<String> swaps(String t) {
		ArrayList<String> a = new ArrayList<>();
		a.add(t);
		a.add(String.format("%s%s%s", t.charAt(1), t.charAt(0), t.charAt(2)));
		a.add(String.format("%s%s%s", t.charAt(0), t.charAt(2), t.charAt(1)));
		return a;
	}

	public int solution(String[] T) {
		Map<String, Integer> occ = new HashMap<>();

		for (String t : T)
			for (String cand : swaps(t).stream().distinct().collect(Collectors.toList()))
				occ.put(cand, occ.containsKey(cand) ? occ.get(cand) + 1 : 1);

		return occ.values().stream().max(Integer::compare).get();
	}
}
