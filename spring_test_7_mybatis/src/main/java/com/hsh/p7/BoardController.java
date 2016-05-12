package com.hsh.p7;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	//글쓰기 > 글목록
	@RequestMapping(value="/write")
	public String writer(@ModelAttribute BoardDTO bdDto){
		boardService.writer(bdDto);
		return "redirect:/board/list?curPage=1";
	}
	
	//글목록
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam int curPage){
		return boardService.list(curPage);
	}
	
	//view 하나 보기
	@RequestMapping("/view")
	public String view(@RequestParam int num, Model model){
		BoardDTO bdDto = boardService.view(num);
		model.addAttribute("bdDto", bdDto);
		return "board/view";
	}
	
	//update Form 연결
	@RequestMapping("/updateForm")
	public void updateForm(@RequestParam int num, Model model){
		BoardDTO bdDto = boardService.view(num);
		model.addAttribute("bdDto", bdDto);
	}
	
	//글수정 
	@RequestMapping(value="/update")
	public String update(@ModelAttribute BoardDTO bdDto){
		boardService.update(bdDto);
		return "redirect:/board/list?curPage=1";
	}
	
	//글삭제
	@RequestMapping(value="/delete")
	public String delete(@RequestParam int num){
		boardService.delete(num);
		return "redirect:/board/list?curPage=1";
	}
}




