package example.lt.lhu.test6;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	Time() {
		hours = 1;
		minutes = 15;
		seconds = 20;
	}

	Time(int h, int m, int s) {
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}

	public void installTime(int h, int m, int s) {
		if (h > 0 && h < 23) {
			this.hours = h;
		} else {
			hours = 0;
		}
		if (m > 0 && m < 60) {
			this.minutes = m;
		} else {
			this.minutes = 0;
		}
		if (s > 0 && s < 60) {
			this.seconds = s;
		} else {
			this.seconds = 0;
		}
	}

	public void changeSeconds(int s) {
		this.seconds = this.seconds + s;
		if (this.seconds > 59) {
			this.minutes = this.minutes + (this.seconds / 60);
			this.seconds = this.seconds % 60;
		}
		if (this.minutes > 59) {
			this.hours = this.hours + (this.minutes / 60);
			this.minutes = this.minutes % 60;
		}
		if (this.hours > 24) {
			this.hours = this.hours % 24;
		}
	}

	public void changeMinutes(int m) {
		changeSeconds(m * 60);
	}

	public void changeHours(int h) {
		changeSeconds(h * 60 * 60);
	}

	public void setHours(int h) {
		if (h > 0 && h < 23) {
			this.hours = h;
		} else {
			hours = 0;
		}
	}

	public int getHours() {
		return this.hours;
	}

	public void setMinutes(int m) {
		if (m > 0 && m < 60) {
			this.minutes = m;
		} else {
			this.minutes = 0;
		}
	}

	public int getMinutes() {
		return this.minutes;
	}

	public void setSeconds(int s) {
		if (s > 0 && s < 60) {
			this.seconds = s;
		} else {
			this.seconds = 0;
		}
	}

	public int getSeconds() {
		return this.seconds;
	}
}
