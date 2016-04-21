package iut.tdd;



public class RomanNumerals {
	public enum Symbol 	{
		M(1000);
		
		private int value;
		private Symbol(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
	
	public String convertToRoman(String arabe) {

		int nombre = Integer.valueOf(arabe);
		StringBuilder romanNumber = new StringBuilder();
		nombre = extractMilliers(nombre, romanNumber);
		nombre = extractCentaines(nombre, romanNumber);
		nombre = extractDizaines(nombre, romanNumber);
		extractUnities(nombre, romanNumber);

		System.out.println(romanNumber);
		return romanNumber.toString();

	}

	private void extractUnities(int nombre, StringBuilder romanNumber) {
		if (nombre == 9) {
			romanNumber.append("IX");
			nombre = nombre - 9;
		}
		if (nombre > 4 && nombre % 10 < 9) {
			romanNumber.append("V");
			nombre = nombre - 5;
		}
		if (nombre == 4) {
			romanNumber.append("IV");
			nombre = nombre - 4;
		}
		if (nombre == 1 || nombre == 2 || nombre == 3) {

			for (int i = nombre % 5; i > 0; i--) {
				romanNumber.append("I");
			}
		}
	}

	private int extractDizaines(int nombre, StringBuilder romanNumber) {
		if (nombre / 10 == 9) {
			romanNumber.append("XC");
			nombre = nombre - 90;
		}
		if (nombre > 49 && nombre < 90) {
			romanNumber.append("L");
			nombre = nombre - 50;
		}
		if (nombre / 10 == 4) {
			romanNumber.append("XL");
			nombre = nombre - 40;
		}
		if (nombre / 10 == 1 || nombre / 10 == 2 || nombre / 10 == 3) {

			for (int i = nombre / 10; i > 0; i--) {
				romanNumber.append("X");
				nombre = nombre - 10;
			}
		}
		return nombre;
	}

	private int extractCentaines(int nombre, StringBuilder romanNumber) {
		if (nombre / 100 == 9) {
			romanNumber.append("CM");
			nombre = nombre - 900;
		}
		if (nombre / 100 == 5 || nombre / 100 == 6 || nombre / 100 == 7 || nombre / 100 == 8) {
			romanNumber.append("D");
			nombre = nombre - 500;
		}

		if (nombre / 100 == 4) {
			romanNumber.append("CD");
			nombre = nombre - 400;
		}
		if (nombre / 100 == 1 || nombre / 100 == 2 || nombre / 100 == 3) {
			for (int i = nombre / 100; i > 0; i--) {
				romanNumber.append("C");
				nombre = nombre - 100;
			}
		}
		return nombre;
	}

	private int extractMilliers(int nombre, StringBuilder romanNumber) {
		if (between1000and3999(nombre)) {
			Symbol symbol = Symbol.M;
			for (int i = nombre / symbol.getValue(); i > 0; i--) {
				romanNumber.append(symbol.name());
				nombre = nombre - symbol.getValue();
			}
		}
		return nombre;
	}

	private boolean between1000and3999(int nombre) {
		return nombre / 1000 >= 1 && nombre / 1000 <= 3;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
