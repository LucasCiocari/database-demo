package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	@Autowired
	private PersonJdbcDao dao;
		
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		logger.info("All users -> {}", dao.findAll());
//		logger.info("User id 10001 -> {}", dao.findById(10001));
//		logger.info("All Pieters -> {}", dao.findByName("Pieter"));
//		logger.info("All Amsterdams -> {}", dao.findByLocation("Amsterdam"));
//		logger.info("Deleting 10002 -> # of rows deleted: {}", dao.deleteById(10002));
//		logger.info("Deleting Amsterdams and  -> # of rows deleted: {}", dao.deleteByNameOrLocation("Pieter", "Amsterdam"));
		logger.info("Inserting 10006 -> {}", dao.insert(new Person(10006, "Tara", "Berlin", new Date())));
		logger.info("Updating 10003 -> {}", dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));
	}

}
