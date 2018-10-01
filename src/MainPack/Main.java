package MainPack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tests:
		String decimalValues = "1,2,3,4,5,6,7,8,9,10,14,15,19,20,100,500,1000";
		String romanValues = "i,ii,iii,iv,v,vi,vii,viii,ix,x,xiv,xv,xix,xx,c,d,m";

        System.out.println("Resultado em romanos: " + GetRomanNumber.toRoman(decimalValues));
        System.out.println("Resultado em decimal: " + GetNumber.romanToDecimal(romanValues));
        
	}
}
