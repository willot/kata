import junit.framework.TestCase;


public class ConvertArabicNumeralToRomanTest extends TestCase {
	
	public void testSimpleConversion() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		String errorMessage = "We only accept positive number"; 
		
		assertEquals("I", converter.convert(1));
		assertEquals("II", converter.convert(2));
		assertEquals(errorMessage, converter.convert(-4));
	}

}
