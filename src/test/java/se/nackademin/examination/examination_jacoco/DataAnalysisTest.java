package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	DataAnalysis dataAnalysis = new DataAnalysis();

	@Test
	public void test1() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}

	@Test
	public void test2() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The first name is smaller or equals in size to the last name and the participant is 30 or younger",
				result.contains(
						"The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "31", "Fortaleza"));
		String result3 = dataAnalysis.getResultStringNamesAndAge(values3);
		assertTrue("No analysis was performed", result3.contains("No analysis was performed"));

		ArrayList<String> values1 = new ArrayList<String>();
		values1.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortaleza"));
		String result1 = dataAnalysis.getResultStringNamesAndAge(values1);
		System.out.println(result1);
		assertTrue("The first name is smaller or equals in size to the last name and the participant is 30 or younger",
				result1.contains("No analysis was performed"));

		ArrayList<String> values2 = new ArrayList<String>();
		values2.addAll(Arrays.asList("Game", "RafaelDaSilva", "Silva", "M", "31", "Fortaleza"));
		String result2 = dataAnalysis.getResultStringNamesAndAge(values2);
		assertTrue("The first name is greater or equals in size to the last name and the participant older than 30",
				result2.contains(
						"The first name is greater or equals in size to the last name and the participant older than 30"));

	}

		@Test
		public void test3() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Stockholm"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The name of the homecity is big and the participant is younger than 30",
				result.contains("The name of the homecity is big and the participant is younger than 30"));

		
			ArrayList<String> value1 = new ArrayList<String>();
			value1.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Umeå"));
			String result1 = dataAnalysis.getResulStringHomecityAndAge(value1);
			assertTrue("The name of the homecity is small and the participant is 30 or older",
					result1.contains("The name of the homecity is small and the participant is 30 or older"));

			ArrayList<String> value2 = new ArrayList<String>();
			value2.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "16", "Umeå"));
			String result2 = dataAnalysis.getResulStringHomecityAndAge(value2);
			assertTrue("The name of the homecity is small and the participant is younger than 30",
					result2.contains("The name of the homecity is small and the participant is younger than 30"));

						
			
		
	}

}
