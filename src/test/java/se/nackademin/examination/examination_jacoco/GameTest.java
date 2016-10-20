package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	Game game = new Game();

	@Test
	public void testMethod1() {
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);

		int b = game.calculateOutPutBasedOnNames("Rafa", "Silva");
		assertEquals("The result should be 0", b, 0);

		int c = game.calculateOutPutBasedOnNames("Rafael", "DaSilv");
		assertEquals("The result should be 2", c, 2);

	}

	@Test
	public void testMethod2() {
		int i = game.calculateOutPutBasedOnAge(27);
		assertEquals("The result should be 1", i, 1);

		int b = game.calculateOutPutBasedOnAge(25);
		assertEquals("The result should be 0", b, 0);
	}

	@Test
	public void testMethod3() {
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0 ", i, 0);

		int b = game.calculateOutPutBasedOnGender('C');
		assertEquals("The result should be 2 ", b, 2);

		int c = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1 ", c, 1);

	}
@Test
public void testMethod4(){
	int a = game.calculateOutPutBasedOnHomeCity("a");
	assertEquals("The result should be 0", a, 0);
	
	int p = game.calculateOutPutBasedOnHomeCity("p");
	assertEquals("The result should be 10", p, 10);

	int b = game.calculateOutPutBasedOnHomeCity("b");
	assertEquals("The result should be 1 ", b, 1);

	int c = game.calculateOutPutBasedOnHomeCity("c");
	assertEquals("The result should be 2 ", c, 2);
	
	int d = game.calculateOutPutBasedOnHomeCity("d");
	assertEquals("The result should be 3 ", d, 3);
	
	int e = game.calculateOutPutBasedOnHomeCity("e");
	assertEquals("The result should be 4 ", e, 4);
	
	int f = game.calculateOutPutBasedOnHomeCity("f");
	assertEquals("The result should be 5 ", f, 5);
	
	int g = game.calculateOutPutBasedOnHomeCity("g");
	assertEquals("The result should be 6", g, 6);
	
	int h = game.calculateOutPutBasedOnHomeCity("h");
	assertEquals("The result should be 7 ", h, 7);
	
	int i = game.calculateOutPutBasedOnHomeCity("i");
	assertEquals("The result should be 8", i , 8);
	
	int j = game.calculateOutPutBasedOnHomeCity("j");
	assertEquals("The result should be 9 ", j, 9);
	
	
	
}
@Test
public void testMethod5(){
	Game game = new Game();
	ArrayList<String> values = new ArrayList<String>();
	values.add("Diyadin");
	values.add("Seker");
	values.add("Male");
	values.add("M");
	game.getGenderFromInputValues(values);
	
	//assertEquals("Gender should be M ", values.get(3),charAt(0), 'M' );
}
@Test
public void testMethod6(){
Game game = new Game();
game.buildFinalString("Diyadin", "Seker", new ResultFromInputs(), new Conversor());
	

}
@Test
public void testMethod7(){
	Game game = new Game();
	game.runGame("Game", "Seker", "Mehmet", 'M', 30, "Stockholm");
	
	
}
@Test
public void testGenderFromInputs(){
	Game game = new Game();
	ArrayList<String> values = new ArrayList<String>();
	values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
	game.run(values);
	
	
}

@Test
public void runTest(){
		
	
}
}
