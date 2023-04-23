package com.example.day1.valueAno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueEx {
	@Value("${carname:'Maruti'}")
	public String car;
	@GetMapping("/mycar")
	@ResponseBody
	public String car()
	{
		return "My favourite car "+car;
	}

}
