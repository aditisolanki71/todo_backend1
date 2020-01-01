package com.aditi.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.task.model.TaskModel;
import com.aditi.task.service.TaskService;

@CrossOrigin
@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@PostMapping
	public TaskModel addTak(@RequestBody TaskModel task) {
		System.out.println(task);
		return taskService.addTak(task);
	}
	
	@GetMapping
	public List<TaskModel> getAllTask() {
		return taskService.getAllTask();
	}
	
	@PutMapping
	public TaskModel updateTaskById(@RequestBody TaskModel task)
	{
		return taskService.updateTaskById(task);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTaskById(@PathVariable int id) {
		taskService.deleteTaskById(id);
	}
	
	@GetMapping("/{id}")
	public TaskModel getTaskById(@PathVariable int id)
	{
		return taskService.getTaskById(id);
	}
	
}
