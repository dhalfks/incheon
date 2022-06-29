package com.myweb.www.ctrl;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.www.domain.BoardVO;
import com.myweb.www.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/board/*")
@Controller
public class BoardController {
	
	@Inject
	private BoardService bsv;
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(BoardVO bvo, RedirectAttributes reAttr) {
		log.debug(">>> {}", bvo);
		reAttr.addFlashAttribute("isUp", bsv.register(bvo) > 0 ? "1":"0");
		return "redirect:/board/list";
	}
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", bsv.getList());
	}
	@GetMapping({"/detail", "/modify"})
	public void detail(Model model, @RequestParam("bno")long bno) {
		model.addAttribute("bvo", bsv.getDetail(bno));
	}
	@PostMapping("/modify")
	public String modify(RedirectAttributes reAttr, BoardVO bvo) {
		log.debug(">>> {}", bvo);
		reAttr.addFlashAttribute("isMod", bsv.modify(bvo) > 0 ? "1":"0");
		return "redirect:/board/detail?bno="+bvo.getBno();
	}
	@PostMapping("/remove")
	public String remove(RedirectAttributes reAttr, @RequestParam("bno")long bno) {
		reAttr.addFlashAttribute("isDel", bsv.remove(bno) > 0 ? "1":"0");
		return "redirect:/board/list";
	}
	
}
