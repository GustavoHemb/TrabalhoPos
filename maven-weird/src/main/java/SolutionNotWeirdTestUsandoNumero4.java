import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

import org.junit.Test;

public class SolutionNotWeirdTestUsandoNumero4 {

	@Test
	public void testingWeirdUsandoValor4() {
       SolutionWeird test = new SolutionWeird();
       String result = test.EsseNumeroEWeirdOuNao(4);
       assertEquals("Not Weird", result);
       
	}
	
}