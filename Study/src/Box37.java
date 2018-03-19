public class Box37 {
	private int width, length, height, volume;

	public int getVolume() {
		return volume;
	}

	Box37(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
		volume = width * length * height;
	}
}
