package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyProjectApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" +
				"<li><a href='/doctor/10'>Doctor 10</a></li>" +
				"<li><a href='/doctor/11'>Doctor 11</a></li>" +
				"<li><a href='/doctor/12'>Doctor 12</a></li>" +
				"<li><a href='/doctor/13'>Doctor 13</a></li>" +
				"</ul>";
	}
	@RequestMapping("/doctor/10")
	@ResponseBody
	public String doctor10(){
		return "David Tennant";
	}
	@RequestMapping("/doctor/11")
	@ResponseBody
	public String doctor11(){
		return "Matt Smith";
	}
	@RequestMapping("/doctor/12")
	@ResponseBody
	public String doctor12(){
		return "Peter Capaldi";
	}
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13(){
		return "Jodie Whittaker";
	}
}
