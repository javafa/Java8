package com.kodonho.util;

public class TimeUtil {

	private Long start;
	private Long end;
	private Long period;

	// ����ð� ���� ������ TimeUtil instance�� ��ȯ
	public static TimeUtil setStart(){
		TimeUtil timeUtil = new TimeUtil();
		timeUtil.start = System.currentTimeMillis();
		return timeUtil;
	}
	
	// setStart ���� �Ѱ��ִ� timeUtil instance�� ���
	public static void setEnd(TimeUtil timeUtil){
		timeUtil.end = System.currentTimeMillis();
		timeUtil.period = timeUtil.end - timeUtil.start;
		System.out.println("duration:"+timeUtil.period);
	}
}
