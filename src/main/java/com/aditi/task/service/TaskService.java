package com.aditi.task.service;

import java.util.List;

import com.aditi.task.model.TaskModel;

public interface TaskService {
	TaskModel addTak(TaskModel task);
	List<TaskModel> getAllTask();
	TaskModel updateTaskById(TaskModel task);
	void deleteTaskById(int id);
	TaskModel getTaskById(int id);
	
}
