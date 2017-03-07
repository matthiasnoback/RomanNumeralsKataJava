package RomanNumerals;

public class RomanNumeralConverter {
    public String toRoman(int decimal) {
        if (decimal >= 40) {
            return "XL" + toRoman(decimal - 40);
        }

        if (decimal >= 10) {
            return "X" + toRoman(decimal - 10);
        }

        if (decimal == 9) {
            return toRoman(1) + toRoman(10);
        }

        if (decimal >= 5) {
            return "V" + toRoman(decimal - 5);
        }

        if (decimal == 4) {
            return toRoman(1) + toRoman(5);
        }

        if (decimal > 0) {
            return toRoman(decimal - 1) + "I";
        }

        return "";
    }
}
