public class Car17 {
	String color;
	int speed, gear;
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed += 10;
	}
	
	void speedDown() {
		speed -= 10;
	}
}
