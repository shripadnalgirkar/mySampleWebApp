package mySampleWebApp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.biz.Validator;

public class TestValidator {

	public TestValidator() {
		// TODO Auto-generated constructor stub
	}
	
	public static Validator validator = null;
	
	@Before
	public void setup() {
		validator = new Validator();
	}
	
	@Test
	public void testValidateAgeValidAge() {
		int age = 38;
		
		Assert.assertTrue(validator.validateAge(age));
		
	}
	
	@Test
	public void testValidateAgeNonValidAge() {
		int age = 10;
		
		Assert.assertTrue(!validator.validateAge(age));
		
	}
	
	@After
	public void tearDown() {
		validator = null;
	}

}
