package com.dao;
import java.util.List;
import bean.Student;
public interface IStudentDAO {
	public abstract Student create (Student stu) throws Exception;
	public abstract void remove(Student stu) throws Exception; 
	public abstract Student find(Student stu) throws Exception; 
	public abstract List<Student> findAll() throws Exception; 
	public abstract void update(Student stu) throws Exception; 
}