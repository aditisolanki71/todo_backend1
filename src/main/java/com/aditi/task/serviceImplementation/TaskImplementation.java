package com.aditi.task.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aditi.task.model.TaskModel;
import com.aditi.task.repository.TaskRepository;
import com.aditi.task.service.TaskService;
@Service
public class TaskImplementation implements TaskService {

	@Autowired
	TaskRepository taskrepo;
	
	@Override
	public TaskModel addTak(TaskModel task) {
		// TODO Auto-generated method stub
		return taskrepo.save(task);
	}

	@Override
	public List<TaskModel> getAllTask() {
		// TODO Auto-generated method stub
		return taskrepo.findAll();
	}

	@Override
	public TaskModel updateTaskById(TaskModel task) {
		// TODO Auto-generated method stub
		return taskrepo.save(task);
	}

	@Override
	public void deleteTaskById(int id) {
		// TODO Auto-generated method stub
		taskrepo.deleteById(id);
		
	}

	@Override
	public TaskModel getTaskById(int id) {
		// TODO Auto-generated method stub
		Optional<TaskModel> t = taskrepo.findById(id);
		return t.get();
	}

}
