package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@RequestMapping("/jsp")
public class JspController {
	
	@GetMapping("/sample")
	public String sample(HttpSession session, Model model) {
		// model.addAttribute("menu", "sample");
		session.setAttribute("menu", "sample");
		
		Address addr1 = new Address(12345, "LA", "USA");
		Address addr2 = new Address(67890, "NYC", "USA");
		Address addr3 = new Address(45335, "Seoul", "Korea");
		Address addr4 = new Address(56462, "Seoul", "Korea");
		Address addr5 = new Address(21455, "Paris", "France");
		
		Member m1 = new Member(101, "James", "james@gmail.com", addr1, "USA", "M");
		Member m2 = new Member(102, "Maria", "maria@gmail.com", addr2, "USA", "F");	
		Member m3 = new Member(103, "Hong", "hong@gmail.com", addr3, "Korea", "M");
		Member m4 = new Member(104, "kevin", "kevin@gmail.com", addr4, "Korea", "M");
		Member m5 = new Member(105, "Hamin", "hamin@gmail.com", addr5, "France", "M");
		
		model.addAttribute("m1", m1);
		model.addAttribute("m2", m2);
		model.addAttribute("m3", m3);
		model.addAttribute("m4", m4);
		model.addAttribute("m5", m5);
		
		Member[] members = {m1, m2, m3, m4, m5};
		model.addAttribute("memberArray", members);
		List<Member> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		model.addAttribute(list);
		
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
		Member m1 = new Member(101, "James", "james@gmail.com", addr1, "USA", "M");
		Member m2 = new Member(102, "Maria", "maria@gmail.com", addr2, "USA", "F");		
		
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
	
	@GetMapping("/jstlCore")
	public String jstlCore(Model model) {
		Address addr1 = new Address(12345, "LA", "USA");
		Address addr2 = new Address(67890, "NYC", "USA");
		Address addr3 = new Address(45335, "Seoul", "Korea");
		Address addr4 = new Address(56462, "Seoul", "Korea");
		Address addr5 = new Address(21455, "Paris", "France");
		
		Member m1 = new Member(101, "James", "james@gmail.com", addr1, "USA", "M");
		Member m2 = new Member(102, "Maria", "maria@gmail.com", addr2, "USA", "F");	
		Member m3 = new Member(103, "Hong", "hong@gmail.com", addr3, "Korea", "M");
		Member m4 = new Member(104, "kevin", "kevin@gmail.com", addr4, "Korea", "M");
		Member m5 = new Member(105, "Hamin", "hamin@gmail.com", addr5, "France", "M");
		
		model.addAttribute("m1", m1);
		model.addAttribute("m2", m2);
		model.addAttribute("m3", m3);
		model.addAttribute("m4", m4);
		model.addAttribute("m5", m5);
		
		Member[] members = {m1, m2, m3, m4, m5};
		model.addAttribute("memberArray", members);
		List<Member> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		model.addAttribute(list);
		
		return "jsp/jstl1_core";
	}
	
	@GetMapping("/jstlFmt")
	public String jstlFmt(Model model) {
		int price = 12345000;
		Date now = new Date();
		model.addAttribute("price", price);
		model.addAttribute("now", now);
		
		LocalDate ldNow = LocalDate.now();
		LocalTime ltNow = LocalTime.now();
		LocalDateTime ldtNow = LocalDateTime.now();
		model.addAttribute("ldNow", ldNow);
		model.addAttribute("ltNow", ltNow);
		model.addAttribute("ltNow2", ltNow.toString().substring(0, 8));
		model.addAttribute("ldtNow", ldtNow);
		model.addAttribute("ldtNow2", ldtNow.toString().replace("T", " ").substring(0, 19));
		
		return "jsp/jstl2_fmt";			
	}
	
	@GetMapping("/jstlFn")
	public String jstlFn(Model model) {
		model.addAttribute("str1", "Hello world!");
		model.addAttribute("str2", "Apache!");
		model.addAttribute("str3", "Catalina!");
		
		return "jsp/jstl3_fn";
	}
	
	@GetMapping("/homework")
	public String homework(Model model) {
		Address addr1 = new Address(12345, "LA", "USA");
		Address addr2 = new Address(67890, "NYC", "USA");
		Address addr3 = new Address(45335, "Seoul", "Korea");
		Address addr4 = new Address(56462, "Seoul", "Korea");
		Address addr5 = new Address(21455, "Paris", "France");
		
		Member m1 = new Member(101, "James", "james@gmail.com", addr1, "USA", "M");
		Member m2 = new Member(102, "Maria", "maria@gmail.com", addr2, "USA", "F");	
		Member m3 = new Member(103, "Hong", "hong@gmail.com", addr3, "Korea", "M");
		Member m4 = new Member(104, "kevin", "kevin@gmail.com", addr4, "Korea", "M");
		Member m5 = new Member(105, "Hamin", "hamin@gmail.com", addr5, "France", "M");
		
		model.addAttribute("m1", m1);
		model.addAttribute("m2", m2);
		model.addAttribute("m3", m3);
		model.addAttribute("m4", m4);
		model.addAttribute("m5", m5);
		
		Member[] members = {m1, m2, m3, m4, m5};
		model.addAttribute("memberArray", members);
		List<Member> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		model.addAttribute(list);
		
		return "jsp/homework";
	}
}















