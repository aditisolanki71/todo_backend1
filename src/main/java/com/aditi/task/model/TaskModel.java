package com.aditi.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TaskModel {
	@Id
	@GeneratedValue
	int id;
	String title;
	String description;
	Boolean isDone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return "TaskModel [id=" + id + ", title=" + title + ", description=" + description + ", isDone=" + isDone + "]";
	}
}
