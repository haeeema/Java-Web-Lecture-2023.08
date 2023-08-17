package com.example.demo;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/bs")
public class BootstrapController {
	@Value("${spring.servlet.multipart.location}") private String uploadDir;

	@GetMapping("/login")
	public String login() {
		return "bs/login";
	}
	
	@PostMapping("/login1")
	@ResponseBody
	public String login1(HttpServletRequest req) {
		String email = req.getParameter("email");
		String pswd = req.getParameter("pswd");
		String remember = req.getParameter("remember");		// check면 "on", 아니면 null
		
		return "<h2>email: " + email + ", pswd: " + pswd + ", remember: " + remember + "</h2>";
	}
	
	@PostMapping("/login2")
	@ResponseBody
	public String login2(String email, String pswd, String remember) {
		return "<h2>email: " + email + ", pswd: " + pswd + ", remember: " + remember + "</h2>";
	}
	
	@GetMapping("/register")
	public String registerForm() {
		return "bs/register";
	}
	
	// 입력값을 확인하기 위함
	@PostMapping("/register")
	@ResponseBody
	public String registerProc(MultipartHttpServletRequest req) {
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		String pwd2 = req.getParameter("pwd2");
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String html = String.format("<h2>%s, %s, %s, %s, %s, %s</h2>", uid, pwd, pwd2, uname, email, gender);
		
		MultipartFile filePart = req.getFile("profile");
		if (filePart.getContentType().contains("image")) {
			String filename = filePart.getOriginalFilename();
			html += "<h2>" + filename + "</h2>";
			String profilePath = uploadDir + filename;
			try {
				filePart.transferTo(new File(profilePath));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return html;
	}
	
	//
	@PostMapping("/register2")
	// @ResponseBody 화면에 띄우는것이 목적이 아니다.
	public String register2Proc(MultipartHttpServletRequest req) {
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		String pwd2 = req.getParameter("pwd2");
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		
		MultipartFile filePart = req.getFile("profile");
		if (filePart.getContentType().contains("image")) {
			String filename = filePart.getOriginalFilename();
			String profilePath = uploadDir + filename;
			try {
				filePart.transferTo(new File(profilePath));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (!checkUid(uid)) {
			System.out.println("uid: " + uid + "이/가 이미 존재합니다.");
			return "redirect:/bs/register";
			// alert message 내보내고, 회원가입 화면으로 되돌려야 함
		} else {
			if (pwd != null && pwd.equals(pwd2)) {
				System.out.println(uname + "님 환영합니다.");
				return "redirect:/bs/login";
				// 올바른 회원가입, 로그인 화면으로 보내줌
			} else {
				System.out.println("패스워드를 올바르게 입력하세요.");
				return "redirect:/bs/register";
				// 패스워드 에러에 대한 경고 메세지, 회원가입화면으로 되돌려 보내줌
			}
		}
	}

	@PostMapping("/register3")
	// 에러메세지를 새 창에
	public String register3Proc(MultipartHttpServletRequest req, Model model) {
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		String pwd2 = req.getParameter("pwd2");
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		
		MultipartFile filePart = req.getFile("profile");
		if (filePart.getContentType().contains("image")) {
			String filename = filePart.getOriginalFilename();
			String profilePath = uploadDir + filename;
			try {
				filePart.transferTo(new File(profilePath));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (!checkUid(uid)) {
			model.addAttribute("msg", "uid: " + uid + "이/가 이미 존재합니다.");
			model.addAttribute("url", "/demo/bs/register");
			return "bs/alertMsg";
		} else {
			if (pwd != null && pwd.equals(pwd2)) {
				model.addAttribute("msg", uname + "님 환영합니다.");
				model.addAttribute("url", "/demo/bs/login");
				return "bs/alertMsg";
			} else {
				model.addAttribute("msg", "패스워드를 올바르게 입력하세여ㅛ");
				model.addAttribute("url", "/demo/bs/register");
				return "bs/alertMsg";
			}
		}
	}
	
	// uid가 DB에 존재하면 false, 없으면 true.
	boolean checkUid(String uid) {
		if (Math.random() > 0.5)
			return true;
		return false;
	}
}








