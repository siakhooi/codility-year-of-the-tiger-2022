package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractYearOfTheTiger2022Test {
	abstract YearOfTheTiger2022Interface getTestObject();

	YearOfTheTiger2022Interface testObject;

	@BeforeEach
	void setup() {
		testObject = getTestObject();

	}

	@Test
	@DisplayName("Sample 1")
	void test01() {
		String[] T = new String[] { "aab", "cab", "baa", "baa" };
		int E = 3;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("Sample 2")
	void test02() {
		String[] T = new String[] { "zzz", "zbz", "zbz", "dgf" };
		int E = 2;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("Sample 3")
	void test03() {
		String[] T = new String[] { "abc", "cba", "cab", "bac", "bca" };
		int E = 3;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("small_one_color")
	void test_small_one_color() {
		String[] T = new String[] { "eee", "eee", "eee", "eee", "eee" };
		int E = 5;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("Short")
	void test_short() {
		String[] T = new String[] { "abc" };
		int E = 1;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("Short 1")
	void test_short1() {
		String[] T = new String[] { "aaa" };
		int E = 1;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("Short 2")
	void test_short2() {
		String[] T = new String[] { "aab" };
		int E = 1;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("Long")
	void test_long() {
		String[] T = new String[] { "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc",
				"abc" };
		int E = 13;

		assertEquals(E, testObject.solution(T));
	}

	@Test
	@DisplayName("Super Long")
	void test_long1() {
		String[] T = new String[50000];
		for (int i = 0; i < 50000; i++)
			T[i] = "abc";
		int E = 50000;

		assertEquals(E, testObject.solution(T));
	}
}
