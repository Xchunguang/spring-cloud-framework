package com.mysoft.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysoft.hystrix.UserHystrix;
import com.mysoft.module.User;


@FeignClient(name = "cloud-mysoft-provide", fallback = UserHystrix.class)
public interface UserClient {
	  @RequestMapping("/{id}")
	  public User findById(@RequestParam("id") Long id);
}



