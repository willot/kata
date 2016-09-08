import junit.framework.TestCase;


public class ConvertArabicNumeralToRomanTest extends TestCase {
	
	public void testConversionErrorsCases() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		String errorMessageNegativeNumbers = "We only accept positive number"; 
		String errorMessageNumberAbove3999 = "Reach possible limit"; 
		
		assertEquals(errorMessageNegativeNumbers, converter.convert(-4));
		assertEquals(errorMessageNumberAbove3999, converter.convert(4000));
		assertEquals(errorMessageNumberAbove3999, converter.convert(4159));
	}
	
	public void testConversionOfBasicNumbers() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		assertEquals("I", converter.convert(1));
		assertEquals("V", converter.convert(5));
		assertEquals("X", converter.convert(10));
		assertEquals("L", converter.convert(50));
		assertEquals("C", converter.convert(100));
		assertEquals("D", converter.convert(500));
		assertEquals("M", converter.convert(1000));
	}
	
	public void testBetterConversionOf4And() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		assertEquals("IV", converter.convert(4));
		assertEquals("IX", converter.convert(9));
		assertEquals("XL", converter.convert(40));
		assertEquals("XC", converter.convert(90));
		assertEquals("CD", converter.convert(400));
		assertEquals("CM", converter.convert(900));
	}	
	
	
	public void testConversionbetween2And10() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		assertEquals("II", converter.convert(2));
		assertEquals("III", converter.convert(3));
		assertEquals("VI", converter.convert(6));
		assertEquals("VII", converter.convert(7));
		assertEquals("IX", converter.convert(9));
	}

	
	public void testConversionbetween11And100() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		assertEquals("XI", converter.convert(11));
		assertEquals("XVII", converter.convert(17));
		assertEquals("XXIX", converter.convert(29));
		assertEquals("XXX", converter.convert(30));
		assertEquals("XLII", converter.convert(42));
		assertEquals("LI", converter.convert(51));
		assertEquals("LXIII", converter.convert(63));
		assertEquals("LXXV", converter.convert(75));
		assertEquals("LXXXIV", converter.convert(84));
		assertEquals("XCVI", converter.convert(96));
		assertEquals("XCIX", converter.convert(99));
	}
	
	public void testConversionbetween100And1000() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		assertEquals("CI", converter.convert(101));
		assertEquals("CLXX", converter.convert(170));
		assertEquals("CCXXIV", converter.convert(224));
		assertEquals("CCCXXXIX", converter.convert(339));
		assertEquals("CDXL", converter.convert(440));
		assertEquals("DLXXXIX", converter.convert(589));
		assertEquals("DCXCIV", converter.convert(694));
		assertEquals("DCCXIII", converter.convert(713));
		assertEquals("DCCCXCV", converter.convert(895));
		assertEquals("CMXVI", converter.convert(916));
		assertEquals("CMXCIX", converter.convert(999));
		assertEquals("MXXXV", converter.convert(1035));
		assertEquals("MCLIX", converter.convert(1159));
		assertEquals("MCMXXI", converter.convert(1921));
		assertEquals("MMDCLXXXVII", converter.convert(2687));
		assertEquals("MMMCMXCIX", converter.convert(3999));
		
	}
}
