package com.infybuzz.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SecondJobScheduler {
	

	@Scheduled(cron = "*/1 * * * * *")
	public String secondJobStarter() {
			System.out.println("Job Executioned ");
			return "success";
	}
}
