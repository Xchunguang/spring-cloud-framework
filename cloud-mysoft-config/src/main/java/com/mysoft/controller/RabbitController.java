package com.mysoft.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysoft.rabbit.Sender;

@RestController
public class RabbitController {

    @Autowired
    private Sender sender;
	
	@GetMapping(value = "/send")
	public Map<String,Object> sendMessage(){
		Map<String,Object> result = new HashMap<>();
		sender.send();
		result.put("result", true);
		return result;
	}
}
