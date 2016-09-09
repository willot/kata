import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


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
				 				 
				 int quotientOfArabicNumber = remainingOfArabicNumber/arabicNumberReferences[index];
					
				 if(arabicNumber == arabicNumberReferences[index] ) {
					 romanNumeral = romanNumberReference[index];
					 return romanNumeral;
				 }
				 
				 if (quotientOfArabicNumber>0) {
					 while (quotientOfArabicNumber >0) {
						 quotientOfArabicNumber --;
						 romanNumeral += romanNumberReference[index];
						 remainingOfArabicNumber = remainingOfArabicNumber - arabicNumberReferences[index];
					 }
				 }
				 
				 if (remainingOfArabicNumber <= 0) {
					 return romanNumeral;
				 }

		 }
		 return romanNumeral;
	 }



	public int convertRomanNumeralIntoArabicNumber(String romanNumber) {
		int arabicNumber = 0;
		String[] splitRomanNumeral = fillRomanToArabicValueHash(romanNumber);
		
		while (splitRomanNumeral.length >0) {
			
					if( splitRomanNumeral.length == 1 ) {
						arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
						return arabicNumber;
					}
					
					else if (splitRomanNumeral[0].equals("I") || splitRomanNumeral[0].equals("X") || splitRomanNumeral[0].equals("C")) {
						String followingRomanNumeral = splitRomanNumeral[1];
						
						if (romanToArabicValue.get(followingRomanNumeral) > romanToArabicValue.get(splitRomanNumeral[0])) {
							 arabicNumber += romanToArabicValue.get(followingRomanNumeral) - romanToArabicValue.get(splitRomanNumeral[0]) ;
							 if(splitRomanNumeral.length < 3) {
								 return arabicNumber;
							 }
							 else {
								 splitRomanNumeral = createNewArrayOfSmallerSize(splitRomanNumeral, 2);
							 }
						}
						else {
							arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
							splitRomanNumeral = createNewArrayOfSmallerSize(splitRomanNumeral, 1);
						}
					}
					
					else {
						arabicNumber += romanToArabicValue.get(splitRomanNumeral[0]);
						splitRomanNumeral = createNewArrayOfSmallerSize(splitRomanNumeral, 1);
					}
					
				}
		return arabicNumber;

	}



	private String[] createNewArrayOfSmallerSize(String[] arrayBeingModified, int startingRangeForNewArray) {
		arrayBeingModified = Arrays.copyOfRange(arrayBeingModified,startingRangeForNewArray,arrayBeingModified.length);
		return arrayBeingModified;
	}



	private String[] fillRomanToArabicValueHash(String romanNumber) {
		String[] splitRomanNumeral = romanNumber.split("");
		romanToArabicValue = new HashMap<String, Integer>();
		romanToArabicValue.put("M",1000);
		romanToArabicValue.put("D",500);
		romanToArabicValue.put("C",100);
		romanToArabicValue.put("L",50);
		romanToArabicValue.put("X",10);
		romanToArabicValue.put("V",5);
		romanToArabicValue.put("I",1);
		return splitRomanNumeral;
	}
		
		
		


}
