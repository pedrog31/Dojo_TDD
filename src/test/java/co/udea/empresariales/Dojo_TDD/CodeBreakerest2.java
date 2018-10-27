package co.udea.empresariales.Dojo_TDD;
import co.udea.empresariales.Dojo_TDD.CodeBreaker;
import static org.junit.Assert.*;

import org.junit.Test;

public class CodeBreakerest2 {
	
	CodeBreaker codeBreaker = new CodeBreaker("1234");

	@Test
	void all_match() {
		String answer = codeBreaker.guess("1234");
		assertEquals("XXXX", answer);
	}

	@Test
	void first_match() {
		String answer = codeBreaker.guess("1987");
		assertEquals("X", answer);
	}
	
	@Test
	void two_match() {
		String answer = codeBreaker.guess("1984");
		assertEquals("XX", answer);
	}	
	
	@Test
	void contains_all_in_diferent_position() {
		String answer = codeBreaker.guess("4321");
		assertEquals("____", answer);
	}	
	
	@Test
	void contains_two_in_diferent_position() {
		String answer = codeBreaker.guess("4891");
		assertEquals("__", answer);
	}
	

	@Test
	void contains_two_in_diferent_and_one_same_position() {
		String answer = codeBreaker.guess("4831");
		assertEquals("X__", answer);
	}
	
	@Test
	void contains_nothing_match() {
		String answer = codeBreaker.guess("9867");
		assertEquals("", answer);
	}
	
	@Test
	void contains_two_in_diferent_and_two_same_position() {
		String answer = codeBreaker.guess("2134");
		assertEquals("XX__", answer);
	}
	
	@Test
	void contains_one_in_diferent_and_two_same_position() {
		String answer = codeBreaker.guess("4230");
		assertEquals("XX_", answer);
	}
	
	@Test
	void more_digits_than_expected() {
		String answer = codeBreaker.guess("42300");
		assertEquals("", answer);
	}
	
	@Test
	void less_digits_than_expected() {
		String answer = codeBreaker.guess("425");
		assertEquals("", answer);
	}
	
	@Test
	void null_parameter() {
		String answer = codeBreaker.guess(null);
		assertEquals("", answer);
	}
	

	@Test
	void all_match_v2() {
		codeBreaker = new CodeBreaker("4589");
		String answer = codeBreaker.guess("4589");
		assertEquals("XXXX", answer);
	}
	
	@Test
	void first_match_v2() {
		codeBreaker = new CodeBreaker("4589");
		String answer = codeBreaker.guess("1523");
		assertEquals("X", answer);
	}

}
