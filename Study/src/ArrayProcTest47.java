public class ArrayProcTest47 {
	final static int STUDENTS = 5;

	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc47 arrayProc47 = new ArrayProc47();
		arrayProc47.getValues(scores);
		System.out.printf("Average: %f", arrayProc47.getAverage(scores));
	}
}
