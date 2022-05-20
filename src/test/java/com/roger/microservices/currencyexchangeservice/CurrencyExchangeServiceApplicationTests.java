package com.roger.microservices.currencyexchangeservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CurrencyExchangeServiceApplicationTests {

	@Test
	void contextLoads() {
		CurrencyExchangeServiceApplication.main(new String[]{});
	}

	@Test
	void failedTest() {
		assert 1 == 2;
	}
}
