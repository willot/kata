import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class ConvertArabicNumeralToRoman {

	private String romanNumeral ="";
	private String[] romanNumberReference= {"M","CM" ,"D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private Integer[] arabicNumberReferences= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	
	 
	 public String convert(int arabicNumber) {
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

}
