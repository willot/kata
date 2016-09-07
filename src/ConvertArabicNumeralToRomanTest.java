import junit.framework.TestCase;


public class ConvertArabicNumeralToRomanTest extends TestCase {
	
	public void testSimpleConversion() {
		ConvertArabicNumeralToRoman converter = new ConvertArabicNumeralToRoman();
		
		assertEquals("I", converter.convert());
	}

}
