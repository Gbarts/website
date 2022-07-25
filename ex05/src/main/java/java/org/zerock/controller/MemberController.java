package org.zerock.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@AllArgsConstructor
@Log4j
@RequestMapping("/member/*")
public class MemberController {

	@GetMapping("/login")
	public void login() {
		
	}
	
	@RequestMapping(value="log", method = RequestMethod.POST)
	public String logincheck() {
		
		
		return "/member/return";
		
	}
	
	/*@RequestMapping("login.do")
	public String login() {
		return "member/login";
	}*/
	
}
