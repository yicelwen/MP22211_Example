package course.c17;

public class CheckCanSwim implements IChecker {
	public boolean test(Animal a) {
		return a.canSwim();
	}
}