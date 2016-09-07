
public class ConvertArabicNumeralToRoman {

	private String romanNumeral;

	public String convert(int arabicNumber) {
		romanNumeral ="";
		String romanNumericalFor5 = "V";
		String romanNumericalFor10 = "X";
		
		int arabicNumberMinus5 = arabicNumber - 5;
		
		if(arabicNumber >0) {
		
			switch (arabicNumber) {
			case 1:
				romanNumeral= "I";
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
		
		return romanNumeral;
		}
		
		return "We only accept positive number";
	}
	
	 public String addTheRightNumberOfI (int arabicNumber, String romanNumeral) {
		while (arabicNumber >0) {
			arabicNumber --;
			romanNumeral += "I";
					}
		return romanNumeral;

	}

}
