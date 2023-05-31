package com.example.labopenclassroom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.labopenclassroom.service.BusinessService;

@SpringBootTest
class LabopenclassroomApplicationTests {
	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	void testHelloWold(){
		String hw=bs.getHelloWorld().toString();
		assertEquals("Hello World!", hw);
	}

}
