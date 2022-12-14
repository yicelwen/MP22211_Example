package course.c16;

public interface ElectronicDevice {
	public static final String WARNING = " handle with care!";
	int x = 10; // is still public & static & final

	public abstract void turnOn();

	void turnOff(); // is still public & abstract
}
