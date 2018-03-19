public class Date40 {
	private int year, month, day;

	public Date40() {
		this(1900, 1, 1);
	}

	public Date40(int year) {
		this(year, 1, 1);
	}

	public Date40(int year, int month) {
		this(year, month, 1);
	}

	public Date40(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("Date [year=%04d, month=%02d, day=%02d]", year, month, day);
	}
}
