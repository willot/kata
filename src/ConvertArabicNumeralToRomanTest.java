import junit.framework.TestCase;


public class ConvertArabicNumeralToRomanTest extends TestCase {
	
	public void testConversionUnder4() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		String errorMessage = "We only accept positive number"; 
		
		assertEquals("I", converter.convert(1));
		assertEquals("II", converter.convert(2));
		assertEquals("III", converter.convert(3));
		assertEquals(errorMessage, converter.convert(-4));
	}
	
	public void testConversionbetween4And10() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		assertEquals("V", converter.convert(5));
		assertEquals("VII", converter.convert(7));
		assertEquals("IX", converter.convert(9));
		assertEquals("X", converter.convert(10));
	}

	
	public void testConversionbetween11And100() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		assertEquals("XI", converter.convert(11));
		assertEquals("XVII", converter.convert(17));
		assertEquals("XXIX", converter.convert(29));
		assertEquals("XLII", converter.convert(42));
		assertEquals("LI", converter.convert(51));
		assertEquals("LXIII", converter.convert(63));
		assertEquals("LXXXIV", converter.convert(84));
		assertEquals("XCVI", converter.convert(96));
	}
}
