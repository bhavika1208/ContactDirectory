package com.bhavika.cd.contactDirectory;

import java.sql.Timestamp;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactDirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactDirectoryApplication.class, args);
		System.out.println("db connected");
		System.out.println(new Timestamp(System.currentTimeMillis()));
	}

}
