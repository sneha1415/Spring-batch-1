package org.cap.demo.batch;

import java.util.List;

import org.cap.demo.model.Student;
import org.cap.demo.repo.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer implements ItemWriter<Student >
{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void write(List<?extends Student>student) throws Exception
	{
		System.out.println("Student Data Saved"+student);
		studentRepository.saveAll(student);
	}
}
