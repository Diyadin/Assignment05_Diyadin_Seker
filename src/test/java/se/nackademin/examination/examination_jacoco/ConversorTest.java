package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	Conversor conversor = new Conversor();

	@Test
	public void testConversorName() {
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");

		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(0), " A, ");

	}

	@Test
	public void testConversorAge() {
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0),
				"You are young and talented! Things will come your way soon enough! ");
	}

	@Test
	public void testConversorGender() {
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(0), "man!");

	}

	@Test
	public void testConversorCity() {
		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(0), " A, ");

	}
}
