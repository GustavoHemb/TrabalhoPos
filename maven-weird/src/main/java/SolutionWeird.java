import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class SolutionWeird {

    public static void main(String[] args) {
    }
    	public String EsseNumeroEWeirdOuNao(int numero) {
    		String print = null;
    		if(numero%2 == 1) {
    			print = "Weird";
    		}
    	
		if(numero%2 ==0) {
			print = "Not Weird";
		}
    		if((numero%2==0) && (numero >= 6 && numero <=20)) {
    			print = "Weird";
    			
    	
    		}
    		if((numero%2==0) && (numero >= 2 && numero <= 5)) {
    			print = "Not Weird";
    		}
    		if((numero%2==0) && (numero > 20)) {
    			print = "Not Weird";
    		}
    		System.out.println(print);
    		return print;
    	}
    	
}
