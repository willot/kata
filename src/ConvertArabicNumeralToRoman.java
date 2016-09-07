
public class ConvertArabicNumeralToRoman {

	public String convert(int arabicNumber) {
		String romanNumeral = "";
		
		if(arabicNumber >0) {
		
		while (arabicNumber>0) {
			arabicNumber --;
			romanNumeral += "I";
					}
		return romanNumeral;
		}
		
		return "We only accept positive number";
	}

}
