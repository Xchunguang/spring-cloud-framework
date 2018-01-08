package com.mysoft;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * 测试步骤:
 * 1. 访问http://localhost:8030/hystrix.stream 可以查看Dashboard
 * 2. 在上面的输入框填入: http://想监控的服务:端口/hystrix.stream进行测试
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {
	  public static void main(String[] args) {
		    new SpringApplicationBuilder(HystrixDashboardApplication.class).web(true).run(args);
		  }
}
