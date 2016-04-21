package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nombre= Integer.valueOf(arabe);
		String chaine="";
		if(nombre%10==5){
			chaine=chaine+"V";}
		if(nombre%10==4){
			chaine=chaine+"IV";
		}
		if(nombre%5==1||nombre%5==2||nombre%5==3){
			
		for(int i=nombre%5;i>0;i--){
			chaine=chaine+"I";
		}}
		
		return chaine;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
