public class Television16 {
	int channel, volume;
	boolean power;
	
	void print() {
		System.out.println("채널은 " + channel + "번 이고 볼륨은 " + volume + "입니다.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
