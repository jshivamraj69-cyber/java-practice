public class Return {
	static int add(int a, int b) {
		return a + b;
	}

	static boolean isPositive(int x) {
		if (x > 0) return true;
		return false;
	}

	static String greet(String name) {
		return "Hello, " + name + "!";
	}

	public static void main(String[] args) {
		System.out.println("add(2, 3) = " + add(2, 3));
		System.out.println("isPositive(-5) = " + isPositive(-5));
		System.out.println(greet("Alice"));
	}
}
