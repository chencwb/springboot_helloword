package com.example.demo02;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo02ApplicationTests {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	void contextLoads() {
		logger.trace("这是trace日志");
		logger.debug("debug日志");
		logger.info("info");
		logger.warn("warn");
		logger.error("error日志");

	}

}
