
public class ConvertArabicNumeralToRoman {

	private String romanNumeral;

	public String convert(int arabicNumber) {
		romanNumeral ="";
		String romanNumericalFor5 = "V";
		String romanNumericalFor10 = "X";
		
		int arabicNumberMinus5 = arabicNumber - 5;
		
		if (arabicNumber>10) {
			int firstDigitValue = arabicNumber/10;
			int secondDigitValue = arabicNumber%10;
			int secondDigitValueMinus5 = secondDigitValue -5;
			
			
			switch (firstDigitValue) {
			case 1: case 2: case 3:
				String romanNumeral2 ="";
				
				romanNumeral2 = addTheRightNumberOfX(firstDigitValue, romanNumeral2);
				
				convertLastDigitIntoRomanNumeral(secondDigitValue, romanNumericalFor5,
						romanNumericalFor10, secondDigitValueMinus5);
				System.out.println(romanNumeral);
				romanNumeral = romanNumeral2 + romanNumeral;
				return romanNumeral;
			
			}
			
			
			
			
		}
		
		if(arabicNumber >0) {
		
			convertLastDigitIntoRomanNumeral(arabicNumber, romanNumericalFor5,
					romanNumericalFor10, arabicNumberMinus5);
		
		return romanNumeral;
		}
		
		return "We only accept positive number";
	}

	private void convertLastDigitIntoRomanNumeral(int arabicNumber,
			String romanNumericalFor5, String romanNumericalFor10,
			int arabicNumberMinus5) {
		switch (arabicNumber) {
		case 1:
			romanNumeral= addTheRightNumberOfI(arabicNumber, romanNumeral);
		break;

		case 2:
			romanNumeral= addTheRightNumberOfI(arabicNumber, romanNumeral);
		break;
		
		case 3:
			romanNumeral= addTheRightNumberOfI(arabicNumber, romanNumeral);
		break;
		
		case 4:
			romanNumeral = "IV";
		break;
		
		case 5:
			romanNumeral = "V";
		break;
		
		case 6:
			romanNumeral= addTheRightNumberOfI(arabicNumberMinus5, romanNumericalFor5);
		break;
		
		case 7:
			romanNumeral= addTheRightNumberOfI(arabicNumberMinus5, romanNumericalFor5);
		break;
		
		case 8:
			romanNumeral=addTheRightNumberOfI(arabicNumberMinus5, romanNumericalFor5);
		break;
		
		case 9:
			romanNumeral= "I" +romanNumericalFor10;
			break;
			
		case 10:
			romanNumeral=romanNumericalFor10;
			break;

		default:
			break;
		}
	}
	
	 public String addTheRightNumberOfI (int arabicNumber, String romanNumeral) {
		while (arabicNumber >0) {
			arabicNumber --;
			romanNumeral += "I";
					}
		return romanNumeral;

	}
	 
	 public String addTheRightNumberOfX (int arabicNumber, String romanNumeral) {
			while (arabicNumber >0) {
				arabicNumber --;
				romanNumeral += "X";
						}
			return romanNumeral;

		}

}
