package course.c15;

public class Car {
	private boolean running = false;
	private InnerEngine engine = new InnerEngine();

	private class InnerEngine {
		public void start() {
			running = true;
		}
	}

	public void start() {
		engine.start();
	}
}
