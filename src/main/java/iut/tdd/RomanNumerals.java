package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {

		int nombre= Integer.valueOf(arabe);
		String chaine="";
		
			
			if(nombre/100==4){
				chaine=chaine+"CD";
				nombre=nombre-400;
			}
		if(nombre/100==1||nombre/100==2||nombre/100==3){
			for(int i=nombre/100;i>0;i--){
				chaine=chaine+"C";
				nombre=nombre-100;
			}}
		if(nombre/10==9){
			chaine=chaine+"XC";
			nombre=nombre-90;
		}
		if(nombre>49 && nombre<90){
			chaine=chaine+"L";
			nombre=nombre-50;
		}
		if(nombre/10==4){
			chaine=chaine+"XL";
			nombre=nombre-40;
		}
		if(nombre/10==1||nombre/10==2||nombre/10==3){
			
			for(int i=nombre/10;i>0;i--){
				chaine=chaine+"X";
				nombre=nombre-10;
			}
			}
		if(nombre%10==9){
			chaine=chaine+"IX";
		}
		if(nombre%10>4 && nombre%10<9){
			chaine=chaine+"V";
		}
		if(nombre%10==4){
			chaine=chaine+"IV";
		}
		if(nombre%5==1||nombre%5==2||nombre%5==3){
			
		for(int i=nombre%5;i>0;i--){
			chaine=chaine+"I";
		}}
		System.out.println(chaine);
		return chaine;

	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
