public class Television16 {
	int channel, volume;
	boolean power;
	
	void print() {
		System.out.println("ä���� " + channel + "�� �̰� ������ " + volume + "�Դϴ�.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
