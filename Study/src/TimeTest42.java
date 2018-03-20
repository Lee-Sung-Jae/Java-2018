public class TimeTest42 {
	public static void main(String[] args) {
		Time42 time1 = new Time42();
		System.out.printf("Time After Called Default initializer : %s", time1.toString());

		Time42 time2 = new Time42(13, 27, 6);
		System.out.printf("Time After Called Second initializer : %s", time2.toString());

		Time42 time3 = new Time42(99, 66 , 77);
		System.out.printf("Time After Set with incorrect time : %s", time3.toString());
	}
}
