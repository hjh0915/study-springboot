package com.work.Log;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogApplicationTests {

	@Test
	void contextLoads() {
		Logger logger = LoggerFactory.getLogger(HelloLog.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
	}

}
