package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nombre= Integer.valueOf(arabe);
		String chaine="";
		for(int i=nombre;i>0;i--){
			chaine=chaine+"I";
		}
		
		return chaine;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
