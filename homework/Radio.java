package homework;

public class Radio {
	String model;
	double channel;
	int volume;
	boolean onOff;
	
	public String onOffSign() {
		return this.onOff == true? "라디오가 켜져있습니다" : "라디오가 꺼져있습니다";
	}
}
