package com.hsh.p7;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hsh.board.BoardDTO;
import com.hsh.board.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService boardService;
	
	//writer Form 연결
	@RequestMapping("/writerForm")
	public void writerForm(){ }
	
	@RequestMapping(value="/write")
	public String writer(@ModelAttribute BoardDTO bdDto){
		
		return "redirect:/";
	}
	
	//view 하나 보기
	@RequestMapping("/view")
	public String view(@RequestParam int num, Model model){
		BoardDTO bdDto = boardService.view(num);
		model.addAttribute("bdDto", bdDto);
		return "board/view";
	}


}




