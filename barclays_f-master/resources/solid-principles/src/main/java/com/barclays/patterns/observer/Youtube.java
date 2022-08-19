package com.barclays.patterns.observer;

public class Youtube {

	public static void main(String[] args) {
		Channel motivationCore = new Channel();
		
		Subscriber s1 = new Subscriber("Venkat");
		Subscriber s2 = new Subscriber("Sejal");
		Subscriber s3 = new Subscriber("Ashutosh");
		Subscriber s4 = new Subscriber("Soni");
		Subscriber s5 = new Subscriber("Snuti");
		
		motivationCore.subscribe(s1);
		motivationCore.subscribe(s2);
		motivationCore.subscribe(s3);
		motivationCore.subscribe(s4);
		motivationCore.subscribe(s5);
		
		s1.subscribeChannel(motivationCore);
		s2.subscribeChannel(motivationCore);
		s3.subscribeChannel(motivationCore);
		s4.subscribeChannel(motivationCore);
		s5.subscribeChannel(motivationCore);
		
		motivationCore.upload("NO Excuses");
		
	}
}
