import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

import org.junit.Test;

public class SolutionWeirdTestUsandoNumero3 {

	@Test
	public void testingWeirdUsandoValor3() {
       SolutionWeird test = new SolutionWeird();
       String result = test.EsseNumeroEWeirdOuNao(3);
       assertEquals("Weird", result);
       
	}
	
}