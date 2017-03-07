package RomanNumerals;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class RomanNumeralConverter {
    public String toRoman(int decimal) {
        if (decimal >= 1000) {
            return "M" + toRoman(decimal - 1000);
        }

        if (decimal >= 900) {
            return "CM" + toRoman(decimal - 900);
        }

        if (decimal >= 500) {
            return "D" + toRoman(decimal - 500);
        }

        if (decimal >= 400) {
            return "CD" + toRoman(decimal - 400);
        }

        if (decimal >= 100) {
            return "C" + toRoman(decimal - 100);
        }

        if (decimal >= 90) {
            return "XC" + toRoman(decimal - 90);
        }

        if (decimal >= 50) {
            return "L" + toRoman(decimal - 50);
        }

        if (decimal >= 40) {
            return "XL" + toRoman(decimal - 40);
        }

        if (decimal >= 10) {
            return "X" + toRoman(decimal - 10);
        }

        if (decimal >= 9) {
            return "IX" + toRoman(decimal - 9);
        }

        if (decimal >= 5) {
            return "V" + toRoman(decimal - 5);
        }

        if (decimal >= 4) {
            return "IV" + toRoman(decimal - 4);
        }

        if (decimal >= 1) {
            return "I" + toRoman(decimal - 1);
        }

        return "";
    }
}
