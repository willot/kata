import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class ConvertArabicNumeralToRoman {

	private String romanNumeral;
	private String romanNumericalFor1 = "I";
	private String romanNumericalFor5 = "V";
	private String romanNumericalFor10 = "X";
	private String romanNumericalFor50 = "L";
	private String romanNumericalFor100 = "C";

	public String convert(int arabicNumber) {
		romanNumeral ="";
		
		if (arabicNumber>10) {
			int tensDigitValue = arabicNumber/10;
			int tensDigitValueMinus5 = arabicNumber/10-5;
			int onesDigitValue = arabicNumber%10;
			int onesDigitValueMinus5 = onesDigitValue -5;
			
			String romanNumeralValueForTenstDigit ="";
			
			switch (tensDigitValue) {
			case 1: case 2: case 3:
				
				
				romanNumeralValueForTenstDigit = addTheRightNumberOfX(tensDigitValue, romanNumeralValueForTenstDigit);
				
				convertOnesDigitIntoRomanNumeral(onesDigitValue, romanNumericalFor5,
						romanNumericalFor10, onesDigitValueMinus5);
				romanNumeral = romanNumeralValueForTenstDigit + romanNumeral;
				return romanNumeral;
				
			case 4: 
			
				romanNumeralValueForTenstDigit = romanNumericalFor10 + romanNumericalFor50;
				
				convertOnesDigitIntoRomanNumeral(onesDigitValue, romanNumericalFor5,
						romanNumericalFor10, onesDigitValueMinus5);
				romanNumeral = romanNumeralValueForTenstDigit + romanNumeral;
				return romanNumeral;
				
				
			case 5: 
			
				romanNumeralValueForTenstDigit = romanNumericalFor50;
				
				convertOnesDigitIntoRomanNumeral(onesDigitValue, romanNumericalFor5,
						romanNumericalFor10, onesDigitValueMinus5);
				romanNumeral = romanNumeralValueForTenstDigit + romanNumeral;
				return romanNumeral;
				
			case 6: case 7: case 8:
				
				romanNumeralValueForTenstDigit = addTheRightNumberOfX(tensDigitValueMinus5, romanNumericalFor50);
				
				convertOnesDigitIntoRomanNumeral(onesDigitValue, romanNumericalFor5,
						romanNumericalFor10, onesDigitValueMinus5);
						
				romanNumeral = romanNumeralValueForTenstDigit + romanNumeral;
				return romanNumeral;
				
			case 9:
					
				romanNumeralValueForTenstDigit = romanNumericalFor10 + romanNumericalFor100;
				
				convertOnesDigitIntoRomanNumeral(onesDigitValue, romanNumericalFor5,
						romanNumericalFor10, onesDigitValueMinus5);
						
				romanNumeral = romanNumeralValueForTenstDigit + romanNumeral;
				return romanNumeral;
			}
			
			
			
			
		}
		
		if(arabicNumber >0) {
			int arabicNumberMinus5 = arabicNumber - 5;
		
			convertOnesDigitIntoRomanNumeral(arabicNumber, romanNumericalFor5,
					romanNumericalFor10, arabicNumberMinus5);
		
		return romanNumeral;
		}
		
		return "We only accept positive number";
	}

	private void convertOnesDigitIntoRomanNumeral(int arabicNumber,
			String romanNumericalFor5, String romanNumericalFor10,
			int arabicNumberMinus5) {
		switch (arabicNumber) {
		case 1: case 2: case 3:
			romanNumeral= addTheRightNumberOfI(arabicNumber, romanNumeral);
		break;
			
		case 4:
			romanNumeral = "IV";
		break;
		
		case 5:
			romanNumeral = romanNumericalFor5;
		break;
		
		case 6: case 7: case 8:
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
	 
	 
	 
	 public String convertVersion2(int arabicNumber) {

		 
		 HashMap< Integer, String> pairValueOfArabicAndRomanNumber = new HashMap< Integer , String >();
		 pairValueOfArabicAndRomanNumber.put(100, "C");
		 pairValueOfArabicAndRomanNumber.put(50, "L");
		 pairValueOfArabicAndRomanNumber.put(10, "X");
		 pairValueOfArabicAndRomanNumber.put(5, "V");
		 pairValueOfArabicAndRomanNumber.put(1, "I");
		 System.out.println(pairValueOfArabicAndRomanNumber);
		 
		 for(HashMap.Entry<Integer, String> pair: pairValueOfArabicAndRomanNumber.entrySet()) {
			 System.out.println(pair.getKey());
			int remainingOfArabicNumber = pair.getKey()/arabicNumber;
			
			 if(remainingOfArabicNumber == 0 ) {
				 romanNumeral = pair.getValue();
				 return romanNumeral;
			 }
			 
		 }
			
		
		 
		 return romanNumeral;
	 }

}
