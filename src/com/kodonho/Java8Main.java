package com.kodonho;

import java.time.Duration;
import java.time.Instant;

import com.kodonho.util.TimeUtil;

public class Java8Main {

	public static void main(String[] args) {
		
		calcDurationBySystemMili();
		calcDuration();
		calcDurationBySystemMili();
		calcDuration();
		calcDurationBySystemMili();
		calcDuration();

	}
	
	// System.currentTimeMillis()를 이용한 소요시간 계산
	public static void calcDurationBySystemMili(){
		TimeUtil timeUtil = TimeUtil.setStart();
		// task
		double r = 0;
		for(Long i=0L;i<1000000000L;i++){
			r=r+i;
		}
		TimeUtil.setEnd(timeUtil);
	}
	
	// Instant.now()를 이용한 소요시간 계산
	public static void calcDuration(){
		Instant start = Instant.now();
		// task
		double r = 0;
		for(Long i=0L;i<1000000000L;i++){
			r=r+i;
		}
		
		Instant end = Instant.now();
		Duration period = Duration.between(start, end);
		long millis = period.toMillis();

		System.out.printf("Instant 소요시간:%d \n", millis);
	}

}
