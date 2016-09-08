
public class ConvertArabicNumeralToRoman {

	private String romanNumeral;
	private String romanNumericalFor1 = "I";
	private String romanNumericalFor5 = "V";
	private String romanNumericalFor10 = "X";
	private String romanNumericalFor50 = "L";
	private String romanNumericalFor100 = "C";

	public String convert(int arabicNumber) {
		romanNumeral ="";
		
		
		
		int arabicNumberMinus5 = arabicNumber - 5;
		
		if (arabicNumber>10) {
			int firstDigitValue = arabicNumber/10;
			int firstDigitValueMinus5 = arabicNumber/10-5;
			int secondDigitValue = arabicNumber%10;
			int secondDigitValueMinus5 = secondDigitValue -5;
			
			String romanNumeralValueForFirstDigit ="";
			
			
			switch (firstDigitValue) {
			case 1: case 2: case 3:
				
				
				romanNumeralValueForFirstDigit = addTheRightNumberOfX(firstDigitValue, romanNumeralValueForFirstDigit);
				
				convertLastDigitIntoRomanNumeral(secondDigitValue, romanNumericalFor5,
						romanNumericalFor10, secondDigitValueMinus5);
				romanNumeral = romanNumeralValueForFirstDigit + romanNumeral;
				return romanNumeral;
				
			case 4: 
			
				romanNumeralValueForFirstDigit = romanNumericalFor10 + romanNumericalFor50;
				
				convertLastDigitIntoRomanNumeral(secondDigitValue, romanNumericalFor5,
						romanNumericalFor10, secondDigitValueMinus5);
				romanNumeral = romanNumeralValueForFirstDigit + romanNumeral;
				return romanNumeral;
				
				
			case 5: 
			
				romanNumeralValueForFirstDigit = romanNumericalFor50;
				
				convertLastDigitIntoRomanNumeral(secondDigitValue, romanNumericalFor5,
						romanNumericalFor10, secondDigitValueMinus5);
				romanNumeral = romanNumeralValueForFirstDigit + romanNumeral;
				return romanNumeral;
				
				case 6: case 7: case 8:
				
				romanNumeralValueForFirstDigit = addTheRightNumberOfX(firstDigitValueMinus5, romanNumericalFor50);
				
				convertLastDigitIntoRomanNumeral(secondDigitValue, romanNumericalFor5,
						romanNumericalFor10, secondDigitValueMinus5);
						
				romanNumeral = romanNumeralValueForFirstDigit + romanNumeral;
				return romanNumeral;
				
			case 9:
					
				romanNumeralValueForFirstDigit = romanNumericalFor10 + romanNumericalFor100;
				
				convertLastDigitIntoRomanNumeral(secondDigitValue, romanNumericalFor5,
						romanNumericalFor10, secondDigitValueMinus5);
						
				romanNumeral = romanNumeralValueForFirstDigit + romanNumeral;
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
			romanNumeral = romanNumericalFor5;
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
			romanNumeral= romanNumericalFor1 + romanNumericalFor10;
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
