package com.mysoft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@ServletComponentScan
@EnableTask
public class TaskApplication {
	@Bean
	public CommandLineRunner commandLineRunner() {
		return new HelloWorldCommandLineRunner();
	}
	  public static void main(String[] args) {
	    SpringApplication.run(TaskApplication.class, args);
	  }
		
	  public static class HelloWorldCommandLineRunner implements CommandLineRunner {

			@Override
			public void run(String... strings) throws Exception {
				System.out.println("Hello World!");
			}
		}
}
