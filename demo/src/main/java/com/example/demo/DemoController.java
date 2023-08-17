package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	// localhost:8080/demo/index
	@GetMapping("/index")
	@ResponseBody
	public String index() {
		return "<h1>Hello World!!!</h1>";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "01.hello";
	}
	
	@GetMapping("/login")
	public String login() {
		return "02.login";
	}
	
	@PostMapping("/login")
//	@ResponseBody
	public String loginProc(HttpServletRequest req, Model model) {
		String uid = req.getParameter("uid");
		// name of input tag
		String pwd = req.getParameter("pwd");
//		return "<h1>uid = " + uid + ", pwd=" + pwd + "</h1>";
		
		model.addAttribute("uid", uid);
		model.addAttribute("pwd", pwd);
		return "03.loginResult";
	}
	
	@GetMapping("/getParam")
	@ResponseBody
	// ResponseBody 에서는 리턴값이 화면에 표시됨 else 주소가 호출됨
	public String getParam(HttpServletRequest req) {
		String a_ = req.getParameter("a");
		String b_ = req.getParameter("b");
		String op = req.getParameter("op");
		String oper = "";
		
		int a = Integer.parseInt(a_);
		int b = Integer.parseInt(b_);
		int result = 0;
		
		switch(op) {
		case "add": result = a + b; oper = "+"; break; 
		case "sub": result = a - b; oper = "-"; break; 
		case "mul": result = a * b; oper = "*"; break; 
		case "div": result = (int) (a / b); oper = "/"; break;
		default: result = 0;
		}
		
		return "<h1>" + a + " " + oper + " " + b + " = " + result + "<h1>";
	}
	
	@GetMapping("/calc")
	public String calcForm() {
		return "04.calcForm";
	}
	
	@PostMapping("/calc")
	public String calcProc(int a, int b, String op, Model model) {

		int result = 0;
		String oper = "";
		
		switch(op) {
		case "add": result = a + b; oper = "+"; break; 
		case "sub": result = a - b; oper = "-"; break; 
		case "mul": result = a * b; oper = "*"; break; 
		case "div": result = (int) (a / b); oper = "/"; break;
		default: result = 0;
		}
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("oper", oper);
		model.addAttribute("result", result);
		
		return "05.calcResult";
	}
	
	@GetMapping("/write")
	public String writeForm() {
		return "06.writeForm";
	}
	
	@PostMapping("/write")
	public String writeProc(HttpServletRequest req, Model model) {
		String title = req.getParameter("title");
		String[] languages = req.getParameterValues("language");
		String content = req.getParameter("content");
		
		String joinLanguages = (languages == null) ? "" : String.join(", ", languages);
		Board board = new Board(title, joinLanguages, content.replace("\n", "<br>"));
//		System.out.println(board);
		
		model.addAttribute("board", board);
		// 07.writeResult로 board 객체를 보내준다.
		
		return "07.writeResult";
	}
	
	@GetMapping("/calculator")
	public String calculator() {
		return "08.calculator";
	}
	
	
	String numTemp = "";
	String opTemp = "";
	int memory = 0;
	
	@PostMapping("/calculator")
	public String calculatorProc(HttpServletRequest req, Model model) {		
		String op = req.getParameter("op");
		String num = req.getParameter("num");
		
		if (memory == 0) {
			if (op == null) { // number
				numTemp += num;
				memory = Integer.parseInt(numTemp);
			} else if (num == null) { // operation
				System.out.println("err");
			}
		} else if (memory != 0) {
			if (op == null) { // number
				numTemp += num;
				if (opTemp == null) {
					memory = Integer.parseInt(numTemp);					
				}
			} else if (num == null) { // operation
				opTemp = op;
				numTemp = "";
			}
		}
		
		System.out.println(opTemp);
		model.addAttribute("eval", numTemp);
		
		return "08.calculator";
	}
}






















