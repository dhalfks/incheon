package com.myweb.www.ctrl;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.www.security.MemberVO;
import com.myweb.www.service.MemberService;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Inject
	private BCryptPasswordEncoder bcpEncoder;
	
	@Inject
	private MemberService msv;
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(MemberVO mvo) {
		mvo.setPwd(bcpEncoder.encode(mvo.getPwd())); 
		return "redirect:"+(msv.register(mvo) > 0 ? "/member/register": "/member/register");
	}
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(HttpServletRequest req, RedirectAttributes reAttr) {
		reAttr.addFlashAttribute("email", req.getAttribute("email"));
		reAttr.addFlashAttribute("errMsg", req.getAttribute("errMsg"));
		return "redirect:/member/login";
	}
}
