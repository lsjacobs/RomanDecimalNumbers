package MainPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetNumber {
	
	/* Funcao para retornar o valor do numero romano */ 
    public static int value(char r) { 
        if (r == 'i')
            return 1;
        if (r == 'v')
            return 5;
        if (r == 'x')
            return 10;
        if (r == 'l')
            return 50;
        if (r == 'c')
            return 100;
        if (r == 'd')
            return 500;
        if (r == 'm') 
            return 1000;
        return -1; 
    }
	
	    
    /* Encontra o num decimal de acordo com o romano entrado */
    public static String romanToDecimal (String romanValues) {

        List<String> romanToNatural = new ArrayList<String>(Arrays.asList(romanValues.split(",")));
        String str;
    	String finalNum = "";
    	int res = 0; 
    	
        for (int i = 0; i < romanToNatural.size(); i++) {
        
        	str = romanToNatural.get(i);
        	res = 0;
        	
	        for (int j = 0; j < str.length(); j++) {
	        	
	            // Pega o valor do primeiro simbolo
	            int simbolo1 = value (str.charAt(j));
	  
	            // Pega o valor do simbolo em sequencia
	            if (j+1 < str.length()) {
	            	
	                int simbolo2 = value(str.charAt(j+1));
	  
	                // Compara ambos valores
	                if (simbolo1 >= simbolo2) {
	                    
	                	// Valor do simbolo atual eh maior ou igual ao proximo
	                    res = res + simbolo1;
	                }
	                else {
	                    res = res + simbolo2 - simbolo1;
	                    j++; // Valor do simbolo menor que o proximo
	                }
	            }
	            else {
	                res = res + simbolo1;
	                j++;
	            }
	        }
	        
	        /* Adiciona a virgula na String resposta */
		    if (i != romanToNatural.size()-1)
		    	finalNum = finalNum + Integer.toString(res) + ", ";
		    else
		    	finalNum = finalNum + Integer.toString(res);
        }
        return finalNum; 
	}
}
