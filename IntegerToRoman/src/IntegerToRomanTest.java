import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {
    IntegerToRoman converter = new IntegerToRoman();

    @Test public void test1() { assertEquals("I", converter.intToRoman(1)); }
    @Test public void test2() { assertEquals("II", converter.intToRoman(2)); }
    @Test public void test3() { assertEquals("III", converter.intToRoman(3)); }
    @Test public void test4() { assertEquals("IV", converter.intToRoman(4)); }
    @Test public void test5() { assertEquals("V", converter.intToRoman(5)); }
    @Test public void test6() { assertEquals("VI", converter.intToRoman(6)); }
    @Test public void test7() { assertEquals("VII", converter.intToRoman(7)); }
    @Test public void test8() { assertEquals("VIII", converter.intToRoman(8)); }
    @Test public void test9() { assertEquals("IX", converter.intToRoman(9)); }
    @Test public void test10() { assertEquals("X", converter.intToRoman(10)); }

    @Test public void test12() { assertEquals("XII", converter.intToRoman(12)); }
    @Test public void test14() { assertEquals("XIV", converter.intToRoman(14)); }
    @Test public void test19() { assertEquals("XIX", converter.intToRoman(19)); }
    @Test public void test20() { assertEquals("XX", converter.intToRoman(20)); }
    @Test public void test27() { assertEquals("XXVII", converter.intToRoman(27)); }
    @Test public void test39() { assertEquals("XXXIX", converter.intToRoman(39)); }
    @Test public void test40() { assertEquals("XL", converter.intToRoman(40)); }
    @Test public void test44() { assertEquals("XLIV", converter.intToRoman(44)); }
    @Test public void test49() { assertEquals("XLIX", converter.intToRoman(49)); }
    @Test public void test50() { assertEquals("L", converter.intToRoman(50)); }

    @Test public void test90() { assertEquals("XC", converter.intToRoman(90)); }
    @Test public void test100() { assertEquals("C", converter.intToRoman(100)); }
    @Test public void test400() { assertEquals("CD", converter.intToRoman(400)); }
    @Test public void test500() { assertEquals("D", converter.intToRoman(500)); }
    @Test public void test999() { assertEquals("CMXCIX", converter.intToRoman(999)); }
}
