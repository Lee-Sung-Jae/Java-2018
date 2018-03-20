public class Box47 {
	int width, length, height, volume;

	Box47(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
		this.volume = width * length * height;
	}

	Box47 whosLargest(Box47 box1, Box47 box2) {
		return box1.volume > box2.volume ? box1 : box2;
	}
}
