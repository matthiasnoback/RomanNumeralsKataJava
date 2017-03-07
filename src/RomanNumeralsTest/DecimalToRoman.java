package RomanNumeralsTest;

public class DecimalToRoman {
    private int decimal;
    private String roman;

    public DecimalToRoman(int decimal, String roman) {
        this.decimal = decimal;
        this.roman = roman;
    }

    public int getDecimal() {
        return decimal;
    }

    public String getRoman() {
        return roman;
    }

    @Override
    public String toString() {
        return "" + decimal + " should be converted to " + roman;
    }
}
