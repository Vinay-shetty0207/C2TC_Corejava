package Exception_Handling_day11;

public class TryCatch1 {

	public static void main(String[] args) {
		try {

			int data = 50 / 0;
		} catch (ArithmeticException a) {

			a.getMessage();
			System.out.println("Exception handling demo");

		}

	}
}
