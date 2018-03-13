public class Date27 {
	int year, month, day;
	String monthName;

	void print1() {
		System.out.printf("%04d.%02d.%02d\n", year, month, day);
	}
	
	void print2() {
		System.out.printf("%s %02d, %04d\n", monthName, day, year);
	}
}
