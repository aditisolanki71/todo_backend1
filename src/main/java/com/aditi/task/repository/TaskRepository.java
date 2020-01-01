package com.aditi.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aditi.task.model.TaskModel;
@Repository
public interface TaskRepository extends JpaRepository<TaskModel,Integer>{

}
