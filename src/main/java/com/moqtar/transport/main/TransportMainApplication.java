package com.moqtar.transport.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransportMainApplication {

	public static void main(String[] args) 
	{
		System.out.println("hi this is transport project");
		SpringApplication.run(TransportMainApplication.class, args);   
		System.out.println("this is transport application");
	}
}