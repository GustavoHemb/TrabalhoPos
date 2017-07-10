import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

import org.junit.Test;

public class SolutionWeirdTestUsandoNumero18 {

	@Test
	public void testingWeirdUsandoValor18() {
       SolutionWeird test = new SolutionWeird();
       String result = test.EsseNumeroEWeirdOuNao(18);
       assertEquals("Weird", result);
       
	}
	
}