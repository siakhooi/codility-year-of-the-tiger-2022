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
		int[] A = new int[] { 2, 3, 3, 4 };
		int L = 3;
		int R = 1;
		int E = 3;

		assertEquals(E, testObject.solution(A, L, R));
	}

	@Test
	@DisplayName("Sample 2")
	void test02() {
		int[] A = new int[] { 2, 3, 3, 4 };
		int L = 3;
		int R = 1;
		int E = 3;

		assertEquals(E, testObject.solution(A, L, R));
	}

	@Test
	@DisplayName("Sample 2")
	void test03() {
		int[] A = new int[] { 2, 3, 3, 4 };
		int L = 3;
		int R = 1;
		int E = 3;

		assertEquals(E, testObject.solution(A, L, R));
	}
}
