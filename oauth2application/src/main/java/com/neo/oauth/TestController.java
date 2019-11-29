package com.neo.oauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("getData")
	public String getData(){
		return "Hello";
	}
}
