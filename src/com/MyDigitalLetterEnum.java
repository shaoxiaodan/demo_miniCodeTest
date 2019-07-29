package com;

public enum MyDigitalLetterEnum {

	ZERO(0, " "), ONE(1, " "), TWO(2, "ABC"), TREE(3, "DEF"), THOUR(4, "GHI"), FIVE(5, "JKL"), SIX(6, "MNO"), SEVEN(7,
			"PQRS"), EIGHT(8, "TUV"), NINE(9, "WXYZ");

	private int digital;
	private String letter;

	private MyDigitalLetterEnum(int digital, String letter) {
		this.digital = digital;
		this.letter = letter;
	}

	public int getDigital() {
		return digital;
	}

	public void setDigital(int digital) {
		this.digital = digital;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public static MyDigitalLetterEnum getLetterFromDigital(int digital) {
		for (MyDigitalLetterEnum digitalletter : MyDigitalLetterEnum.values()) {
			if (digitalletter.getDigital() == digital) {
				return digitalletter;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return this.digital + "_" + this.letter;
	}

}
