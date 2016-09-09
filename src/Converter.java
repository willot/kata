import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;


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
		int arabicNumber;
		String[] splitRomanNumeral = romanNumber.split("");
		arabicNumber =0;
		
		while(splitRomanNumeral.length >0)
		for (int indexRomanReference = 0; indexRomanReference < romanNumberReference.length; indexRomanReference++) {
							System.out.println("REF " + romanNumberReference[indexRomanReference]);
				System.out.println("string " + splitRomanNumeral[0]);
							
				if(romanNumberReference[indexRomanReference].equals(splitRomanNumeral[0] )) {
					arabicNumber +=arabicNumberReferences[indexRomanReference];
					splitRomanNumeral = Arrays.copyOfRange(splitRomanNumeral,1,splitRomanNumeral.length);
					System.out.println("Arabic number: "+ arabicNumber);
					System.out.println("lenghtofarray: "+ splitRomanNumeral.length);
			}
			
				if(splitRomanNumeral.length == 0) {
					return arabicNumber;
				}
			
		}
	
		return arabicNumber;
	}

}
