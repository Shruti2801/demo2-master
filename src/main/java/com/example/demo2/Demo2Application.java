package com.example.demo2;

import com.example.demo2.model.Product;
import com.example.demo2.model.Student;
import com.example.demo2.repository.ProductRepository;
import com.example.demo2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.OneToOne;

@SpringBootApplication
public class Demo2Application {
	@Autowired
	ProductRepository ob;

	@Autowired
	StudentRepository ob1;

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

//	@Override
//	public void run(String args) throws Exception
//	{
//		Student student = new Student(1,"DIPC","dipc");
//		ob1.save(student);
//		Product product= new Product();
//		ob.save(product);
//	}

}
