public class Circle43 {
	private int radius;
	private Point43 center;

	public Circle43(Point43 center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return String.format("Circle [radius=$d, center=%s]", radius, center);
	}
}
