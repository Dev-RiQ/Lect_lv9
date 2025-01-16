package utils;

public class Utils {

	private Utils() {}
	private static Utils instance;
	public static Utils getInstance() {
		if(instance == null) instance = new Utils();
		return instance;
	}
}
