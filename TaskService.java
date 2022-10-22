package testclasses;

import java.util.*;


public class TaskService {
	
	private List<Task> listOfTask = new ArrayList<>();
	
	//creates task id randomly
	private String genNewID() {
		return UUID.randomUUID().toString().substring(
				0, Math.min(toString().length(), 10));
	}
	
	
	//checks task id exist
	public Task searchForTask(String tid) throws Exception {
		
		for (int i = 0;i < listOfTask.size(); i++) {
			if (tid.equals(listOfTask.get(i).getId())) {
				return listOfTask.get(i);
				
			} 
		}
		throw new Exception("task id is not found");
	}

	
	public void addTask(String nm, String desc) {
		Task task = new Task(genNewID(), nm, desc);
		listOfTask.add(task);
	}

	
	public void deleteTask(String tid) throws Exception {
		listOfTask.remove(searchForTask(tid));
	}

	
	//updating the name or description
	public void updateName(String tid, String nm) throws Exception {
		searchForTask(tid).setName(nm);
	}

	
	public void updateDescription(String tid, String desc)throws Exception {
		searchForTask(tid).setDescription(desc);
	}

	
	public List<Task> getlistOfTask() { 
		return listOfTask; }
} //end class