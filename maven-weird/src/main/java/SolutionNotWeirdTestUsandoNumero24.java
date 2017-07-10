import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

import org.junit.Test;

public class SolutionNotWeirdTestUsandoNumero24 {

	@Test
	public void testingWeirdUsandoValor24() {
       SolutionWeird test = new SolutionWeird();
       String result = test.EsseNumeroEWeirdOuNao(24);
       assertEquals("Not Weird", result);
       
	}
	
}