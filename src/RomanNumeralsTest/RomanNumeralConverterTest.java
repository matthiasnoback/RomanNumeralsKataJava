package RomanNumeralsTest;

import RomanNumerals.RomanNumeralConverter;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {
    private RomanNumeralConverter converter = new RomanNumeralConverter();

    private List<DecimalToRoman> createTestData() {
        ArrayList<DecimalToRoman> testData = new ArrayList<DecimalToRoman>();
        testData.add(new DecimalToRoman(1, "I"));
        testData.add(new DecimalToRoman(2, "II"));
        testData.add(new DecimalToRoman(3, "III"));
        testData.add(new DecimalToRoman(4, "IV"));
        testData.add(new DecimalToRoman(5, "V"));
        testData.add(new DecimalToRoman(6, "VI"));
        testData.add(new DecimalToRoman(7, "VII"));
        testData.add(new DecimalToRoman(8, "VIII"));
        testData.add(new DecimalToRoman(9, "IX"));
        testData.add(new DecimalToRoman(10, "X"));
        testData.add(new DecimalToRoman(11, "XI"));
        testData.add(new DecimalToRoman(13, "XIII"));
        testData.add(new DecimalToRoman(14, "XIV"));
        testData.add(new DecimalToRoman(15, "XV"));
        testData.add(new DecimalToRoman(16, "XVI"));
        testData.add(new DecimalToRoman(17, "XVII"));
        testData.add(new DecimalToRoman(18, "XVIII"));
        testData.add(new DecimalToRoman(19, "XIX"));
        testData.add(new DecimalToRoman(20, "XX"));
        testData.add(new DecimalToRoman(21, "XXI"));
        testData.add(new DecimalToRoman(22, "XXII"));
        testData.add(new DecimalToRoman(23, "XXIII"));
        testData.add(new DecimalToRoman(24, "XXIV"));
        testData.add(new DecimalToRoman(25, "XXV"));
        testData.add(new DecimalToRoman(26, "XXVI"));
        testData.add(new DecimalToRoman(27, "XXVII"));
        testData.add(new DecimalToRoman(28, "XXVIII"));
        testData.add(new DecimalToRoman(29, "XXIX"));
        testData.add(new DecimalToRoman(30, "XXX"));
        testData.add(new DecimalToRoman(31, "XXXI"));
        testData.add(new DecimalToRoman(32, "XXXII"));
        testData.add(new DecimalToRoman(33, "XXXIII"));
        testData.add(new DecimalToRoman(34, "XXXIV"));
        testData.add(new DecimalToRoman(35, "XXXV"));
        testData.add(new DecimalToRoman(36, "XXXVI"));
        testData.add(new DecimalToRoman(37, "XXXVII"));
        testData.add(new DecimalToRoman(38, "XXXVIII"));
        testData.add(new DecimalToRoman(39, "XXXIX"));
        testData.add(new DecimalToRoman(40, "XL"));

        return testData;
    }

    @TestFactory
    Stream<DynamicTest> testDecimalToRomanConversions() {
        return DynamicTest.stream(
                createTestData().iterator(),
                DecimalToRoman::toString,
                datum -> testDecimalToRomanConversion(datum.getDecimal(), datum.getRoman())
        );
    }

    private void testDecimalToRomanConversion(int decimal, String roman) {
        assertEquals(roman, converter.toRoman(decimal));
    }
}
