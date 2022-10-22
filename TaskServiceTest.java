package testclasses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	//testing addTask
	@Test
	void testAddTask() {
		TaskService tService = new TaskService();
		tService.addTask("MilkCows", "Milk the cows before sunrise.");
		Assertions.assertNotNull(tService.getlistOfTask().get(0).getId());
		Assertions.assertNotEquals("INITIAL",tService.getlistOfTask().get(0).getId());
	}
	

	@Test
	void testAddTaskLongName() {
		TaskService service = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> service.addTask("jEREMYmillertooolooooooooooooooooong","Milk the cows before sunrise."));
	}
	
	
	@Test
	void tesAddTaskLongDescription() {
		TaskService service = new TaskService();
		assertThrows(IllegalArgumentException.class,
				() -> service.addTask("Milkcows", 
						"This task is too longgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg"));
	}
	
	
	
	@Test
	void testAddTaskNameNull() {
		TaskService service = new TaskService();
		assertThrows(IllegalArgumentException.class, () -> service.addTask(null,
				"Milk the cows before sunrise."));
	}
	
	
	@Test
	void testAddTaskDescriptionNull() {
		TaskService service = new TaskService();
		assertThrows(IllegalArgumentException.class,() -> service.addTask("Milk the cows", null));
	}
	
	// testing deleteTask
	
	@Test
	void testDeleteTask() throws Exception {
		TaskService tService = new TaskService();
		tService.addTask("Milk the cows", "Milk the cows before sunrise!");
		assertEquals(1, tService.getlistOfTask().size());
		tService.deleteTask(tService.getlistOfTask().get(0).getId());
		assertEquals(0, tService.getlistOfTask().size());
	}
	
	
	@Test
	void testDeleteTaskUnknown() throws Exception {
		TaskService tService = new TaskService();
		tService.addTask("MilktheCows", "Please get all the milk out before sunrise.");
		assertEquals(1, tService.getlistOfTask().size());
		assertThrows(Exception.class, () -> tService.deleteTask("4204204"));
		assertEquals(1, tService.getlistOfTask().size());
	}
	
	
	//test update functions
	@Test
	void testUpdateName() throws Exception {
		TaskService tService = new TaskService();
		tService.addTask("MilktheCows", "Milk all those cows before morning");
		tService.updateName(tService.getlistOfTask().get(0).getId(),"Eatsomeshrimp");
		assertEquals("Eatsomeshrimp", tService.getlistOfTask().get(0).getName());
	}
	
	
	@Test
	void testUpdateDescription() throws Exception {
		TaskService tService = new TaskService();
		tService.addTask("Eat shrimp", "How do you eat shrimp?");
		tService.updateDescription(tService.getlistOfTask().get(0).getId(),"Pour butter on shrimp now!");
		assertEquals("Pour butter on shrimp now!",
				tService.getlistOfTask().get(0).getDescription());
	}
	

}
