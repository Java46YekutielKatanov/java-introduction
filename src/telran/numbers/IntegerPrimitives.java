package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while (res > 0) {
			res++;
		}
		return (byte) (res - 1);
	}

	public static byte getMinByte() {
		return (byte) (getMaxByte() + 1);
	}

	public static int getLenghthByte() {
		int lenght = 0;
		int number = 1;
		while (number <= -(getMinByte() - getMinByte())) {
			number = number * 2;
			lenght++;
		}
		return lenght / 8;
	}

	public static char getMaxChar() {
		char res = 1;
		while (res > 0) {
			res = (char) (res * 2);
		}
		return (char) (res - 1);
	}

	public static char getMinChar() {
		return (char) (getMaxChar() + 1);
	}

	public static int getLenghthChar() {
		// TODO Auto-generated method stub
		return -1;
	}

	public static short getMaxShort() {
		short res = 1;
		while (res > 0) {
			res = (short) (res * 2);
		}
		return (short) ((short) res - 1);
	}

	public static short getMinShort() {
		return (short) (getMaxShort() + 1);
	}

	public static int getLenghthShort() {
		// TODO Auto-generated method stub
		return -1;
	}

	public static int getMaxInt() {
		int res = 1;
		while (res > 0) {
			res++;
		}
		return res - 1;
	}

	public static int getMinInt() {
		return getMaxInt() + 1;
	}

	public static int getLenghthInt() {
		// TODO Auto-generated method stub
		return -1;
	}

	public static long getMaxLong() {
		long res = 1;
		while (res > 0) {
			res = res * 2;
		}
		return res - 1;
	}

	public static long getMinLong() {
		return getMaxLong() + 1;
	}

	public static int getLenghthLong() {
		// TODO Auto-generated method stub
		return -1;
	}

	// как можно передать тип переменной в аргументе функции???
	// как выводить результат в консоль?

	private static int getLenght(long x) {
		// TODO

		return -1;
	}

}
