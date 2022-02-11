package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;


public class ingredientTest {
	
	Ingredient test1;
	
	public void setupStage1() {
		test1=new Ingredient("Tomate",245);
	}
	
	@Test
	void test1() {
		setupStage1();
		test1.addWeight(54);
		assertEquals(299, test1.getWeight());
	}
	
	@Test
	void test2() {
		setupStage1();
		int addw=-100;
		try {
			if (addw<0) {
				throw new NegativeNumberException("No se puede añadir cantidades negativas");
			}else {
	            test1.addWeight(addw);
	        }
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		assertEquals(245, test1.getWeight());
		
		
	}
	
	@Test
	void test3() {
		setupStage1();
		test1.removeWeight(45);
		assertEquals(200, test1.getWeight());
	}
	
	@Test
	void test4() {
		setupStage1();
		int revw=-100;
		try {
			if (revw<0) {
				throw new NegativeNumberException("No se puede usar cantidades negativas");
			}else {
	            test1.removeWeight(revw);
	        }
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		assertEquals(245, test1.getWeight());
		
		
	}
	

}