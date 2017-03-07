package RomanNumerals;

import java.util.ArrayList;

public class RomanNumeralConverter {
    private ArrayList<DecimalRomanPair> conversionMap;

    public RomanNumeralConverter() {
        this.conversionMap = new ArrayList<DecimalRomanPair>();
        this.conversionMap.add(new DecimalRomanPair(1000, "M"));
        this.conversionMap.add(new DecimalRomanPair(900, "CM"));
        this.conversionMap.add(new DecimalRomanPair(500, "D"));
        this.conversionMap.add(new DecimalRomanPair(400, "CD"));
        this.conversionMap.add(new DecimalRomanPair(100, "C"));
        this.conversionMap.add(new DecimalRomanPair(90, "XC"));
        this.conversionMap.add(new DecimalRomanPair(50, "L"));
        this.conversionMap.add(new DecimalRomanPair(40, "XL"));
        this.conversionMap.add(new DecimalRomanPair(10, "X"));
        this.conversionMap.add(new DecimalRomanPair(9, "IX"));
        this.conversionMap.add(new DecimalRomanPair(5, "V"));
        this.conversionMap.add(new DecimalRomanPair(4, "IV"));
        this.conversionMap.add(new DecimalRomanPair(1, "I"));
    }

    public String toRoman(int decimal) {
        for (DecimalRomanPair pair : this.conversionMap) {
            if (decimal >= pair.getDecimal()) {
                return pair.getRoman() + toRoman(decimal - pair.getDecimal());
            }
        }

        return "";
    }
}
