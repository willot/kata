
public class ConvertArabicNumeralToRoman {

	public String convert(int arabicNumber) {
		String romanNumeral = "";
		
		if(arabicNumber >0) {
		
			switch (arabicNumber) {
			case 1:
				romanNumeral= "I";
			break;
		
			case 2:
				while (arabicNumber>0) {
				arabicNumber --;
				romanNumeral += "I";
						}
			break;
			case 3:
				while (arabicNumber>0) {
				arabicNumber --;
				romanNumeral += "I";
						}
			break;
			case 4:
				romanNumeral += "IV";
			break;
			
			case 5:
				romanNumeral += "V";
			break;
			
			case 6:
				romanNumeral = "V";
				arabicNumber = arabicNumber -5;
				while (arabicNumber >0) {
					arabicNumber --;
					romanNumeral += "I";
							}
			break;
			
			case 7:
				romanNumeral = "V";
				arabicNumber = arabicNumber -5;
				while (arabicNumber >0) {
					arabicNumber --;
					romanNumeral += "I";
							}
			break;
			
			case 8:
				romanNumeral = "V";
				arabicNumber = arabicNumber -5;
				while (arabicNumber >0) {
					arabicNumber --;
					romanNumeral += "I";
							}
			break;
		
			default:
				break;
			}
		
		return romanNumeral;
		}
		
		return "We only accept positive number";
	}

}
