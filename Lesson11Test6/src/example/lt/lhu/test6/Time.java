package example.lt.lhu.test6;

import java.util.Scanner;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	Time() {
		hours = 1;
		minutes = 15;
		seconds = 20;
	}

	Time(int a, int b, int c) {
		this.hours = a;
		this.minutes = b;
		this.seconds = c;
	}

	public int installHours() {
		Scanner h = new Scanner(System.in);
		hours = h.nextInt();

		if (hours > -1 && hours < 25) {
			return hours;
		} else {
			hours = 0;
			return hours;
		}
	}

	public int installMinutes() {
		Scanner m = new Scanner(System.in);
		minutes = m.nextInt();

		if (minutes > -1 && minutes < 61) {
			return minutes;
		} else {
			minutes = 0;
			return minutes;
		}
	}

	public int installSeconds() {
		Scanner s = new Scanner(System.in);
		seconds = s.nextInt();

		if (seconds > -1 && seconds < 61) {
			return seconds;
		} else {
			seconds = 0;
			return seconds;
		}
	}

	public void installTime() {
		System.out.println("Install time ");
		System.out.println("Hours : ");
		installHours();
		System.out.println("Minutes: ");
		installMinutes();
		System.out.println("Seconds: ");
		installSeconds();

	}

	public void print() {
		System.out.println("Time = " + hours + " :" + minutes + " :" + seconds + " .");
	}

	public void setHours(int a) {
		this.hours = a;
	}

	public int getHours() {
		return this.hours;
	}

	public void setMinutes(int b) {
		this.minutes = b;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public void setSeconds(int c) {
		this.seconds = c;
	}

	public int getSeconds() {
		return this.seconds;
	}

}
