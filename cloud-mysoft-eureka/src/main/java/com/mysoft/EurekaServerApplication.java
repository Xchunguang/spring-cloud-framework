package com.mysoft;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	 public static void main(String[] args) {
			// 读取控制台输入，决定使用哪个profiles
		 	System.out.println("输入slave1或slave2启动服务");
			Scanner scan = new Scanner(System.in);
			String profiles = scan.nextLine();
			new SpringApplicationBuilder(EurekaServerApplication.class).profiles(profiles).run(args);
	 }
}
