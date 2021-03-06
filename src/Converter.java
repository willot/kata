import java.util.Arrays;
import java.util.HashMap;


public class Converter {

	private String romanNumeral ="";
	private String[] romanNumberReference= {"M","CM" ,"D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private Integer[] arabicNumberReferences= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private HashMap<String, Integer> romanToArabicValue;
	 
	 public String convertArabicNumberIntoRomanNumeral(int arabicNumber) {
		 romanNumeral ="";
		 int remainingOfArabicNumber = arabicNumber;
	 
		 if (arabicNumber > 3999) {
			 romanNumeral = "Reach possible limit";
			 return romanNumeral;
		 }
		 if (arabicNumber < 0) {
			 romanNumeral = "We only accept positive number";
			 return romanNumeral;
		 }

		for (int index = 0; index < arabicNumberReferences.length; index++) {
			int arabicNumberFromArabicNumberReferences	= 	arabicNumberReferences[index];			
			
				if(arabicNumber == arabicNumberFromArabicNumberReferences ) {
					romanNumeral = romanNumberReference[index];
					return romanNumeral;
				}
				
				 int quotientOfArabicNumber = remainingOfArabicNumber/arabicNumberFromArabicNumberReferences;
				 
				 if (quotientOfArabicNumber>0) {
					 while (quotientOfArabicNumber >0) {
						 quotientOfArabicNumber --;
						 romanNumeral += romanNumberReference[index];
						 remainingOfArabicNumber = remainingOfArabicNumber - arabicNumberFromArabicNumberReferences;
					 }
				 }

		 }
		 return romanNumeral;
	 }

	public int convertRomanNumeralIntoArabicNumber(String romanNumber) throws NotRomanException {
		int arabicNumber = 0;
		fillRomanToArabicValueHash();
		String[] splitRomanNumeral = romanNumber.split("");
		
		
		for (int index = 0; index < splitRomanNumeral.length; index++) {
			if (romanToArabicValue.get(splitRomanNumeral[index]) == null) {
				throw new NotRomanException("This is not a Roman numeral");
							}
		}
		
		while (splitRomanNumeral.length >0) {
					
					if( splitRomanNumeral.length == 1 ) {
						arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
						return arabicNumber;
					}
					
					else {
						String[] arrayContainingIndex0and1OfSplitRomanNumeral = {splitRomanNumeral[0] + splitRomanNumeral[1]};
						
						if(romanToArabicValue.get(arrayContainingIndex0and1OfSplitRomanNumeral[0]) != null) {
							arabicNumber += romanToArabicValue.get(arrayContainingIndex0and1OfSplitRomanNumeral[0]);
							splitRomanNumeral = createNewArrayOfSmallerSize(splitRomanNumeral, 2);
						}
						
						else {arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
						splitRomanNumeral = createNewArrayOfSmallerSize(splitRomanNumeral, 1);
						}
					}
					
				}
		return arabicNumber;
	}

	private String[] createNewArrayOfSmallerSize(String[] arrayBeingModified, int startingRangeForNewArray) {
		arrayBeingModified = Arrays.copyOfRange(arrayBeingModified,startingRangeForNewArray,arrayBeingModified.length);
		return arrayBeingModified;
	}

	private void fillRomanToArabicValueHash() {
		romanToArabicValue = new HashMap<String, Integer>();
		romanToArabicValue.put("M",1000);
		romanToArabicValue.put("D",500);
		romanToArabicValue.put("C",100);
		romanToArabicValue.put("L",50);
		romanToArabicValue.put("X",10);
		romanToArabicValue.put("V",5);
		romanToArabicValue.put("I",1);
		romanToArabicValue.put("IV",4);
		romanToArabicValue.put("IX",9);
		romanToArabicValue.put("XL",40);
		romanToArabicValue.put("XC",90);
		romanToArabicValue.put("CD",400);
		romanToArabicValue.put("CM",900);
	}

}
