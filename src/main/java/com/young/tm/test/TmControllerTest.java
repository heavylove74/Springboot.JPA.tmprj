package com.young.tm.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 디폴트 패키지 밑으로 스캔해서 메모리에 올림
@RestController 
public class TmControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
}
