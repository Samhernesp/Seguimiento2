package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class recipeTest {
	
	Recipe test1,test2;
	
	public void setupStage1() {
			
		test1= new Recipe();
		
	}
	
	public void setupStage2() {
		
		test2= new Recipe();
		
		test2.addIngredient("Cebolla", 375);
		test2.addIngredient("Ajo", 58);
		test2.addIngredient("Arroz", 520);
		
	}
	
	@Test
	void test1 () {
		setupStage1();
		
		test1.addIngredient("Sal", 12);
		
		int position=0;
	
		for (int i = 0; i < test1.getIngredients().size() ; i++) {
			
			if (test1.getIngredients().get(i).getName().equals("Sal")) {
				position=i;
			}
			
		}
		
		assertEquals("Sal",test1.getIngredients().get(position).getName());
		assertEquals(12,test1.getIngredients().get(position).getWeight() );
		assertEquals(1, test1.getIngredients().size());
	}
	
	@Test
	void test2() {
		setupStage2();
		
		test2.addIngredient("Pimienta", 6);
		
		int position=0;
	
		for (int i = 0; i < test2.getIngredients().size() ; i++) {
			
			if (test2.getIngredients().get(i).getName().equals("Pimienta")) {
				position=i;
			}
			
		}
		
		assertEquals("Pimienta",test2.getIngredients().get(position).getName());
		assertEquals(6,test2.getIngredients().get(position).getWeight() );
		assertEquals(4, test2.getIngredients().size());
	}
	
	@Test
	void test3() {
		setupStage2();
		
		test2.addIngredient("Ajo", 21);
		
		int position=0;
	
		for (int i = 0; i < test2.getIngredients().size() ; i++) {
			
			if (test2.getIngredients().get(i).getName().equals("Ajo")) {
				position=i;
			}
			
		}
		
		assertEquals("Ajo",test2.getIngredients().get(position).getName());
		assertEquals(79,test2.getIngredients().get(position).getWeight() );
		assertEquals(3, test2.getIngredients().size());
	}
	
	@Test
	void test4 () {
		setupStage2();
		
		test2.removeIngredient("Ajo");
		
		assertEquals(2, test2.getIngredients().size());
	}
	

}
