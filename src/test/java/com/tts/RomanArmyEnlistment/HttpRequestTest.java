package com.tts.RomanArmyEnlistment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@BeforeEach
	void setUp() {
		System.out.println("Tester itself initiated");
	}
	
	@Test
	void enlistmentEndpointWorks() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" +port+ "/enlist", String.class)).contains("Enlistment Form");
	}

}