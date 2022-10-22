package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class TaskTest {

	//test ContactID
		@Test
		void testTaskIDTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Task("1117420111595949","Jeremy",
						"Go to the store and eat some cookies.");
			});
		}
		
		@Test
		void testTaskIDNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Task(null,"Jeremy",
						"Go to the store and eat some cookies.");
			});
		}
		
		//test firstName
		@Test
		void testTaskNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Task("1117420111","Jeremmmmmmmmmmmydsjkhfskdhjfskdfhsdfkhsf",
						"Go to the store and eat some cookies.");
			});
		}
		
		@Test
		void testTaskNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Task("1117420111",null,
						"Go to the store and eat some cookies.");
			});
		}
		
	
		
		//test description
		@Test
		void testTaskDescriptionTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Task("1117420111","Jeremy",
						"Go to the store and eat some cookies and eat shrimp and apples and pineapples, and stake, and cats, and dogs!!!!!!!!!!!!!!!!!!!.");
			});
		}
		
		@Test
		void testTaskDescriptionNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Task("1117420111","Jeremmmmmmmmmmmy",
						null);
			});
		}


	}



