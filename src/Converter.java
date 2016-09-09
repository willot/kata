import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Converter {

	private String romanNumeral ="";
	private String[] romanNumberReference= {"M","CM" ,"D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//	private String[] romanNumberReference= {"V","I"};
	private Integer[] arabicNumberReferences= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	
	
	 
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
		String[] splitRomanNumeral = romanNumber.split("");
		HashMap<String, Integer> romanToArabicValue = new HashMap<String, Integer>();
		romanToArabicValue.put("M",1000);
		romanToArabicValue.put("D",500);
		romanToArabicValue.put("C",100);
		romanToArabicValue.put("L",50);
		romanToArabicValue.put("X",10);
		romanToArabicValue.put("V",5);
		romanToArabicValue.put("I",1);
		

		
		while (splitRomanNumeral.length >0) {
			
			for (Entry<String, Integer> entry : romanToArabicValue.entrySet()) {
				if(entry.getKey().equals(splitRomanNumeral[0])) {
					
					if( splitRomanNumeral.length == 1 ) {
						arabicNumber += entry.getValue();
						return arabicNumber;
						
					}
					
					if(splitRomanNumeral[0].equals("I") || splitRomanNumeral[0].equals("X") || splitRomanNumeral[0].equals("C")) {
						String temp = splitRomanNumeral[1];
						
						
						if (romanToArabicValue.get(temp) > entry.getValue()) {
							 arabicNumber += romanToArabicValue.get(temp) - entry.getValue() ;
							 if(splitRomanNumeral.length < 3) {
								 return arabicNumber;
							 }
							 else {
								 
								 splitRomanNumeral = Arrays.copyOfRange(splitRomanNumeral,2,splitRomanNumeral.length);
							 }
						}
						else {
							arabicNumber += entry.getValue();
							splitRomanNumeral = Arrays.copyOfRange(splitRomanNumeral,1,splitRomanNumeral.length);
						}
					}
					else {
						arabicNumber += entry.getValue();
						splitRomanNumeral = Arrays.copyOfRange(splitRomanNumeral,1,splitRomanNumeral.length);
					}
					
				}
				
			}
		}
		return arabicNumber;

	}
		
		
		


}
