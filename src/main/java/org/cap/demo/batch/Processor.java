package org.cap.demo.batch;

import java.util.HashMap;
import java.util.Map;

import org.cap.demo.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
@Component
public class Processor implements ItemProcessor<Student, Student>
{
	public static final Map<String,String> studentName =new HashMap<>();

	
	 public Processor()
		{
			studentName.put("Tom", "Sneha");
			studentName.put("Jerry", "Shraddha");
			
		}

	@Override
	public Student process(Student student) throws Exception {
		
		String name=student.getName();
		System.out.println(name);
		String Update_Name=studentName.get(name);
		System.out.println(Update_Name);

		student.setName(Update_Name);
		System.out.println("Processor"+student);
		
		
		 
		return student;
	}
	
}
