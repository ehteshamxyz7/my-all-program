package com.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student();
		student1.setFristName("Ehtesham");
		student1.setLastName("Alam");
		student1.setEmail("ehteshm@gmail.com");

		Student student2 = new Student();
		student2.setFristName("Asad");
		student2.setLastName("Ahmed");
		student2.setEmail("asad@gmail.com");

		Student student3 = new Student();
		student3.setFristName("Aamir");
		student3.setLastName("khan");
		student3.setEmail("aamir@gmail.com");

		Student student4 = new Student();
		student4.setFristName("Sakib");
		student4.setLastName("Raza");
		student4.setEmail("sakib@gmail.com");

		Student student5 = new Student();
		student5.setFristName("Aatif");
		student5.setLastName("Abid");
		student5.setEmail("aatifgmail.com");

		Student student6 = new Student();
		student6.setFristName("Zaki");
		student6.setLastName("Ahmed");
		student6.setEmail("zaki@gmail.com");

		Student student7 = new Student();
		student7.setFristName("Arshad");
		student7.setLastName("khan");
		student7.setEmail("arshad@gmail.com");

		Student student8 = new Student();
		student8.setFristName("Anas");
		student8.setLastName("Ahmed");
		student8.setEmail("anas@gmail.com");

		Student student9 = new Student();
		student9.setFristName("Nomaan");
		student9.setLastName("Siddiqui");
		student9.setEmail("noman@gmail.com");
	}

	/*
	 * Iterable<Student> list = List.of(student1, student2, student3, student4,
	 * student5, student6, student7, student8, student9); List<Student> result =
	 * studentService.saveAll(list); result.forEach(e -> System.out.println(e)); {
	 * System.out.println(result); }
	 * 
	 * }
	 */

	public  Student getByid(Long id) {
		return this.studentService.findById((long) 10);
		
	}

}
