package course.c16;

public class Television implements ElectronicDevice {
	public void turnOn() {
	}

	public void turnOff() {
	}

	public void changeChannel(int channel) {
	}

	public static void main(String[] args) {
		ElectronicDevice d = new Television();
		d.turnOn();
		d.turnOff();
		d.changeChannel(58); // 特化方法，無法編譯
		String s = d.toString(); // 可使用Object類別的所有方法
	}
}
