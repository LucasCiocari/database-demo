package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	PersonJpaRepository repository;
		
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		logger.info("All users -> {}", repository.findAll());
//		logger.info("User id 10001 -> {}", repository.findById(10001));
//		logger.info("All Pieters -> {}", repository.findByName("Pieter"));
//		logger.info("All Amsterdams -> {}", repository.findByLocation("Amsterdam"));
//		logger.info("Deleting 10002 -> # of rows deleted: {}", repository.deleteById(10002));
//		logger.info("Deleting Amsterdams and  -> # of rows deleted: {}", repository.deleteByNameOrLocation("Pieter", "Amsterdam"));
//		logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Berlin", new Date())));
//		logger.info("Updating 10003 -> {}", repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
//		repository.deleteById(10002);
	}

}
