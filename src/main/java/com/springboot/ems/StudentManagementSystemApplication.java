package com.springboot.ems;

import com.springboot.ems.entity.Student;
import com.springboot.ems.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception{
//		Student student1 = new Student("Amish", "Goyal", "amish@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Akash", "Jain", "akash@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Kaushik", "Aditya", "koushik@gmail.com");
//		studentRepository.save(student3);
	}

}
