package com.zeus.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LomboksTests {

	@Test
	public void testNoArgConstructor() {
		Board board = new Board();
		board.setContent("스프링부트");
		System.out.println(board);
	}
	
	@Test
	public void testToStringExclude() {
		Member member = new Member();
		System.out.println(member);
	}
}
