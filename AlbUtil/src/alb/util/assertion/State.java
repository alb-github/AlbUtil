package alb.util.assertion;

public class State {
	
	public static void isNotNull(Object obj) {
		isTrue( obj != null, " Cannot be null " );
	}

	public static void isNull(Object obj) {
		isTrue( obj == null, " Must be null " );
	}

	public static void isTrue(boolean test) {
		isTrue( test, "" );
	}
	
	public static void isTrue(boolean test, String msg) {
		if (test == true) return;
		throwException(msg);
	}

	protected static void throwException(String msg) {
		throw new IllegalStateException( msg );
	}

}
