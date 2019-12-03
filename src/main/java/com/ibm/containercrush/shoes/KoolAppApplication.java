package com.ibm.containercrush.shoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class KoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoolAppApplication.class, args);
	}

	@RequestMapping("index")
	public String index()
	{
		return "index.html";
	}
}
