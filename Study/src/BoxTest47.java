public class BoxTest47 {
	public static void main(String[] args) {
		Box47 box1 = new Box47(10, 20, 50);
		Box47 box2 = new Box47(10, 30, 30);

		Box47 largest = box1.whosLargest(box1, box2);
		System.out.printf("(%d, %d, %d)", largest.width, largest.length, largest.height);
	}
}
