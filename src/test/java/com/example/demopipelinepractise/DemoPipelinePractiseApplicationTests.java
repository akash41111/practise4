package com.example.demopipelinepractise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoPipelinePractiseApplicationTests {

	@Test
	void contextLoads() {
		
		var addmethods = new AddMethods();
		
		assertEquals(6, addmethods.add(3,3));
	}

}
