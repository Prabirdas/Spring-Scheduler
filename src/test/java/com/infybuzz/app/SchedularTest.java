package com.infybuzz.app;




import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.infybuzz.service.SecondJobScheduler;


class SchedularTest {

	
	@Test
	void secondJobStarter() {
		SecondJobScheduler jobScheduler = new SecondJobScheduler();
		assertEquals("success", jobScheduler.secondJobStarter());
	}

}
