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
	}

}
