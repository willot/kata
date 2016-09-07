import junit.framework.TestCase;


public class ConvertArabicNumeralToRomanTest extends TestCase {
	
	public void testSimpleConversion() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		
		assertEquals("I", converter.convert(1));
		assertEquals("II", converter.convert(2));
	}

}
