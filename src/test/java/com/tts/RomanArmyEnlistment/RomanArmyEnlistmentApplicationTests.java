package com.tts.RomanArmyEnlistment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.tts.RomanArmyEnlistment.controller.RecruitController;

@SpringBootTest
class TRomanArmyEnlistmentApplicationTests {
	
	@Autowired
	private RecruitController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

