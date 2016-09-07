
public class ConvertArabicNumeralToRoman {

	public String convert(int arabicNumber) {
		String romanNumeral = "";
		
		while (arabicNumber>0) {
			arabicNumber --;
			romanNumeral += "I";
					}
		
		return romanNumeral;
	}

}
