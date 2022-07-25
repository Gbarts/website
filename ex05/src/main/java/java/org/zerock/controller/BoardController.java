package org.zerock.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.dto.BoardDTO;
import org.zerock.mapper.BoardMapper;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@AllArgsConstructor
@Log4j
@RequestMapping("/board/*")
public class BoardController {
	private BoardService service;
	private BoardMapper mapper;
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list", service.getList());
	}
	@RequestMapping(value = "resu", method = RequestMethod.POST) 
	public String resu(BoardVO vo, Model model,RedirectAttributes rttr ){
		
		model.addAttribute("content", vo);
		model.addAttribute("regdate",vo);
		mapper.insert(vo);
		System.out.println(vo);
		return "redirect:/board/list";
		
	}
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(@RequestParam("bno") Long bno) throws Exception {
		service.remove(bno);
		
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/modify")
	public void modify(Long bno,String content,HttpServletRequest request,Model model, BoardVO vo, RedirectAttributes rttr){
		//request.getAttribute("bno" );
		request.setAttribute("bno", bno);
		System.out.println(bno);
		rttr.addAttribute(bno);
		//request.getAttribute("content");
		request.setAttribute("content", content);
		System.out.println(vo);
		
	}
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(Long bno,@ModelAttribute BoardVO vo,Model model,HttpServletRequest request) throws Exception {
		
		model.addAttribute("bno", bno);
		
		
		vo.setBno(bno);
		
		
		
		service.modify(vo);
		
		
		return "redirect:/board/list";
		
	}
	@RequestMapping(value = "insert2", method = RequestMethod.GET)
	public String insert2(Long bno,@ModelAttribute BoardVO vo,Model model) throws Exception {
		model.addAttribute("bno" ,bno);
		
		vo.setBno(bno);
		
		service.insert2(vo);
		
		return "redirect:/board/list";
	}
	
}
