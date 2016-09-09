import junit.framework.TestCase;


public class ConvertArabicNumeralToRomanTest extends TestCase {
	
	public void testConversionErrorsCases() {
		Converter converter = new Converter();
		String errorMessageNegativeNumbers = "We only accept positive number"; 
		String errorMessageNumberAbove3999 = "Reach possible limit"; 
		
		assertEquals(errorMessageNegativeNumbers, converter.convertArabicNumberIntoRomanNumeral(-4));
		assertEquals(errorMessageNumberAbove3999, converter.convertArabicNumberIntoRomanNumeral(4000));
		assertEquals(errorMessageNumberAbove3999, converter.convertArabicNumberIntoRomanNumeral(4159));
	}
	
	public void testConversionOfBasicNumbers() {
		Converter converter = new Converter();
		assertEquals("I", converter.convertArabicNumberIntoRomanNumeral(1));
		assertEquals("V", converter.convertArabicNumberIntoRomanNumeral(5));
		assertEquals("X", converter.convertArabicNumberIntoRomanNumeral(10));
		assertEquals("L", converter.convertArabicNumberIntoRomanNumeral(50));
		assertEquals("C", converter.convertArabicNumberIntoRomanNumeral(100));
		assertEquals("D", converter.convertArabicNumberIntoRomanNumeral(500));
		assertEquals("M", converter.convertArabicNumberIntoRomanNumeral(1000));
	}
	
	public void testBetterConversionOf4And() {
		Converter converter = new Converter();
		assertEquals("IV", converter.convertArabicNumberIntoRomanNumeral(4));
		assertEquals("IX", converter.convertArabicNumberIntoRomanNumeral(9));
		assertEquals("XL", converter.convertArabicNumberIntoRomanNumeral(40));
		assertEquals("XC", converter.convertArabicNumberIntoRomanNumeral(90));
		assertEquals("CD", converter.convertArabicNumberIntoRomanNumeral(400));
		assertEquals("CM", converter.convertArabicNumberIntoRomanNumeral(900));
	}	
	
	
	public void testConversionbetween2And10() {
		Converter converter = new Converter();
		assertEquals("II", converter.convertArabicNumberIntoRomanNumeral(2));
		assertEquals("III", converter.convertArabicNumberIntoRomanNumeral(3));
		assertEquals("VI", converter.convertArabicNumberIntoRomanNumeral(6));
		assertEquals("VII", converter.convertArabicNumberIntoRomanNumeral(7));
		assertEquals("IX", converter.convertArabicNumberIntoRomanNumeral(9));
	}

	
	public void testConversionbetween11And100() {
		Converter converter = new Converter();
		assertEquals("XI", converter.convertArabicNumberIntoRomanNumeral(11));
		assertEquals("XVII", converter.convertArabicNumberIntoRomanNumeral(17));
		assertEquals("XXIX", converter.convertArabicNumberIntoRomanNumeral(29));
		assertEquals("XXX", converter.convertArabicNumberIntoRomanNumeral(30));
		assertEquals("XLII", converter.convertArabicNumberIntoRomanNumeral(42));
		assertEquals("LI", converter.convertArabicNumberIntoRomanNumeral(51));
		assertEquals("LXIII", converter.convertArabicNumberIntoRomanNumeral(63));
		assertEquals("LXXV", converter.convertArabicNumberIntoRomanNumeral(75));
		assertEquals("LXXXIV", converter.convertArabicNumberIntoRomanNumeral(84));
		assertEquals("XCVI", converter.convertArabicNumberIntoRomanNumeral(96));
		assertEquals("XCIX", converter.convertArabicNumberIntoRomanNumeral(99));
	}
	
	public void testConversionbetween100And1000() {
		Converter converter = new Converter();
		assertEquals("CI", converter.convertArabicNumberIntoRomanNumeral(101));
		assertEquals("CLXX", converter.convertArabicNumberIntoRomanNumeral(170));
		assertEquals("CCXXIV", converter.convertArabicNumberIntoRomanNumeral(224));
		assertEquals("CCCXXXIX", converter.convertArabicNumberIntoRomanNumeral(339));
		assertEquals("CDXL", converter.convertArabicNumberIntoRomanNumeral(440));
		assertEquals("DLXXXIX", converter.convertArabicNumberIntoRomanNumeral(589));
		assertEquals("DCXCIV", converter.convertArabicNumberIntoRomanNumeral(694));
		assertEquals("DCCXIII", converter.convertArabicNumberIntoRomanNumeral(713));
		assertEquals("DCCCXCV", converter.convertArabicNumberIntoRomanNumeral(895));
		assertEquals("CMXVI", converter.convertArabicNumberIntoRomanNumeral(916));
		assertEquals("CMXCIX", converter.convertArabicNumberIntoRomanNumeral(999));
		assertEquals("MXXXV", converter.convertArabicNumberIntoRomanNumeral(1035));
		assertEquals("MCLIX", converter.convertArabicNumberIntoRomanNumeral(1159));
		assertEquals("MCMXXI", converter.convertArabicNumberIntoRomanNumeral(1921));
		assertEquals("MMDCLXXXVII", converter.convertArabicNumberIntoRomanNumeral(2687));
		assertEquals("MMMCMXCIX", converter.convertArabicNumberIntoRomanNumeral(3999));
		
	}
	
	public void testConversionOfBasicRomanNumeralIntoArabicNumbers() throws NotRomanException {
		Converter converter = new Converter();
		
		assertEquals(1, converter.convertRomanNumeralIntoArabicNumber("I"));
		assertEquals(2, converter.convertRomanNumeralIntoArabicNumber("II"));
		assertEquals(3, converter.convertRomanNumeralIntoArabicNumber("III"));
		assertEquals(5, converter.convertRomanNumeralIntoArabicNumber("V"));
		assertEquals(6, converter.convertRomanNumeralIntoArabicNumber("VI"));
		assertEquals(7, converter.convertRomanNumeralIntoArabicNumber("VII"));
		assertEquals(8, converter.convertRomanNumeralIntoArabicNumber("VIII"));
		assertEquals(10, converter.convertRomanNumeralIntoArabicNumber("X"));
		
		
	}	
	
	public void testConversionOfcomplexRomanNumeralIntoArabicNumbers() throws NotRomanException {
		Converter converter = new Converter();
		
		assertEquals(4, converter.convertRomanNumeralIntoArabicNumber("IV"));
		assertEquals(9, converter.convertRomanNumeralIntoArabicNumber("IX"));
		assertEquals(14, converter.convertRomanNumeralIntoArabicNumber("XIV"));
		assertEquals(19, converter.convertRomanNumeralIntoArabicNumber("XIX"));
		assertEquals(24, converter.convertRomanNumeralIntoArabicNumber("XXIV"));
		assertEquals(29, converter.convertRomanNumeralIntoArabicNumber("XXIX"));
		assertEquals(92, converter.convertRomanNumeralIntoArabicNumber("XCII"));
		assertEquals(249, converter.convertRomanNumeralIntoArabicNumber("CCXLIX"));
		assertEquals(1159, converter.convertRomanNumeralIntoArabicNumber("MCLIX"));
		assertEquals(1949, converter.convertRomanNumeralIntoArabicNumber("MCMXLIX"));
		assertEquals(2444, converter.convertRomanNumeralIntoArabicNumber("MMCDXLIV"));
		assertEquals(3999, converter.convertRomanNumeralIntoArabicNumber("MMMCMXCIX"));
		
	}
	
	public void testThrowExceptionWhenConvertRomanNumeralIntoArabicNumberIsGivenANonRomanNumber(){
		Converter converter = new Converter();
		
		try {
			converter.convertRomanNumeralIntoArabicNumber("GHJ");
		} catch (NotRomanException e) {
			String message = "This is not a Roman numeral";
			assertEquals(message, e.getMessage());

		}
	}	
}
