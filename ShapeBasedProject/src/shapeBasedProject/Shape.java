package shapeBasedProject;

public interface Shape {

	//java8 fetaure: default method
	public default void rotate() {
		System.out.println("Rotate shape");
	}
	public default void test() {
		System.out.println("Test Method");
		run();
	}

  //java8 feature/: static method
	public static void demo() {
		System.out.println("Demo method");
	}
	public static void start() {
		System.out.println("Start method");
		check();
	}
	
	//java9 feature: private method
	private void run() {
		System.out.println("Run Method");
	}
	private static void check() {
		System.out.println("Check Method");
	}
	
}
