package Test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import String.StringCalculator;

import static org.junit.Assert.assertEquals;



public class CalculatorTest {
	
	

	    private StringCalculator calculator;

	    @Rule
	    public ExpectedException thrown = ExpectedException.none();

	    @Before
	    public void initialize() {
	        calculator = new StringCalculator();
	    }

	    @Test
	    public void emptyStringShouldReturn0() {
	        assertEquals(calculator.Add(""), 0);
	    }
	    
	    @Test
	    public void stringReturnSameNumber() {
	        assertEquals(calculator.Add("1"), 1);
	        assertEquals(calculator.Add("5"), 5);
	    }

	  
	  	}



