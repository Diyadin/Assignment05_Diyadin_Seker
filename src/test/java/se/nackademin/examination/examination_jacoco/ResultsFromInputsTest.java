package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	ResultFromInputs resultsFromInputs = new ResultFromInputs();
	@Test
	public void testAgeGettersAndSettersMethods() {
		resultsFromInputs.setResultForNameLenght(0);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 0);
	}
	
	@Test
	public void getResultForGenderTest() {
		resultsFromInputs.setResultForGender('M');
		assertEquals("The result should be Male",resultsFromInputs.getResultForGender(), 'M');

	
}
	@Test
	public void getResultForAgeTest() {
		resultsFromInputs.setResultForAge(27);
		assertEquals("The result should be 27",resultsFromInputs.getResultForAge(), 27);

	}
@Test
public void getResultForHomeCity(){
	resultsFromInputs.setResultForHomeCity(0);
	assertEquals("The result should be 0",resultsFromInputs.getResultForHomeCity(),0);

}


}
