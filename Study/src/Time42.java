public class Time42 {
	private int hour, minute, second;

	public Time42() {
		this(0, 0, 0);
	}

	public Time42(int hour, int minute, int second) {
		this.hour = (hour >= 0 && hour < 24) ? hour : 0;
		this.minute = (minute >= 0 && minute < 24) ? minute : 0;
		this.second = (second >= 0 && second < 24) ? second : 0;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
