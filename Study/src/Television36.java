public class Television36 {
	private int channel, volume;
	private boolean power;

	Television36(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	void print() {
		System.out.printf("%d Channel, Volume %d", channel, volume);
	}
}
