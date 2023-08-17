package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/jsp")
public class JspController {
	
	@GetMapping("/sample")
	public String sample(HttpSession session, Model model) {
		// model.addAttribute("menu", "sample");
		session.setAttribute("menu", "sample");
		return "jsp/sample";
	}
	
	@GetMapping("/schedule")
	public String schedule(Model model) {
		model.addAttribute("menu", "schedule");
		return "jsp/schedule";
	}
	
	@GetMapping("/elOperator")
	public String elOperator() {   // 구별하고자하는 이름일 뿐이다.
		
		return "jsp/el1_operator";
	}
	
	@GetMapping("/elScope")
	public String elScope(HttpSession session, Model model) {
		// Application > Session > Request > Page
		session.setAttribute("sName", "sName");
		model.addAttribute("mName", "mName");
		session.setAttribute("name", "sName");
		model.addAttribute("name", "mName");
		return "jsp/el2_scope";
	}
	
	@GetMapping("/elCollections")
	public String elCollections(Model model) {
		/**Array**/
		// == String[] fruits = {"melon", "apple", "tomato", "grape"};
		String[] fruits = "melon, apple, tomato, grape".split(",");
		model.addAttribute("fruitArray", fruits);
		
		/**List**/
		List<String> sports = new ArrayList<>();
		// String typed list interface = new object.
		sports.add("soccer");
		sports.add("basketball");
		sports.add("baseball");
		sports.add("swim");
		model.addAttribute("sportsList", sports);
		
		/**Map**/
		Map<String, String> map = new HashMap<>();
		// String typed map interface = new object.
		map.put("key", "el");
		map.put("value", "jstl");
		model.addAttribute("map", map);
		
		return "jsp/el3_collections";
	}
	
	// Plain old java object
	@GetMapping("/elPojo")
	public String elPojo(Model model) {
		Address addr1 = new Address(12345, "LA", "USA");
		Address addr2 = new Address(67890, "NYC", "USA");
		Member m1 = new Member(101, "James", addr1);
		Member m2 = new Member(102, "Maria", addr2);		
		
		model.addAttribute("m1", m1);
		model.addAttribute("m2", m2);
		
		Member[] members = {m1, m2};
		model.addAttribute("memberArray", members);
		
		List<Member> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		model.addAttribute(list);
		
		return "jsp/el4_pojo";
	}
}















