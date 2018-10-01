package MainPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetRomanNumber{
	public static String toRoman (String values) {
		
		List<String> valuesToRoman = new ArrayList<String>(Arrays.asList(values.split(",")));
		
		String finalRomanNum = "";
		
		for (int i = 0; i < valuesToRoman.size(); i++) {
			String[] romanNumerals = { "m", "cm", "d",  "cd", "c" , "xc", "l", "xl", "x", "ix", "v", "iv", "i"};
			int[] romanNumeralNums = {1000,  900, 500,  400 , 100 ,  90,  50,   40,  10,   9,    5,    4,   1 };
			
			/* n inicia com o valor de entrada */
			int n = Integer.parseInt(valuesToRoman.get(i));
			int currentNum;
			
			/* Para cada numero entrado, divide ele por cada valor do vetor de números naturais */
		    for (int j = 0; j < romanNumeralNums.length; j++) {
		    	currentNum = n / romanNumeralNums[j];
		    	//System.out.println("Valor "+n+" / " + romanNumeralNums[j] + " = "+currentNum);
		    	
		    	/* Enquanto o número natural do vetor for maior que o número entrado, avança para o próximo num */
		    	if (currentNum == 0) {
		    		continue;
		    	}
		    	/* Adiciona o numeral romano na string enquanto k for menor que n */
		    	for (int k = 0; k < currentNum; k++) {
		    		finalRomanNum = finalRomanNum + romanNumerals[j];
		    		//System.out.println("Romano: " + finalRomanNum + " ");
		    	}
		    	//System.out.print("Novo n: resto de n: " + n +" / "+romanNumeralNums[j]);
		    	n = n % romanNumeralNums[j];
		    	//System.out.println(" = " + n );
		    }
		    
		    /* Adiciona a virgula na String resposta */
		    if (i != valuesToRoman.size()-1)
		    	finalRomanNum = finalRomanNum + ", ";
		
		}
	    return finalRomanNum;
	}
		
		
}
