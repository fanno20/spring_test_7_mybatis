package com.hsh.board;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.hsh.util.PageMaker;

@Service
public class BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	//글한개보기
	public BoardDTO view(int num){
		BoardDTO bdDto = null;
		try {
			bdDto = boardDAO.view(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bdDto;
	}
	
	//글쓰기
	public void writer(BoardDTO bdDto){
		try {
			boardDAO.write(bdDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private int perPage = 10;
	
	//글목록10개
	public ModelAndView list(int curPage){
		List<BoardDTO> list = null;
		ModelAndView md = new ModelAndView();
		
		int start = (curPage - 1) * perPage;
		int last = curPage * perPage;
		
		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("start", start);
		hs.put("last", last);
		
		PageMaker pm = new PageMaker();
		
		try {
			int totalList = boardDAO.totalList();
			list = boardDAO.list(hs);
			hs.put("totalList", totalList);
			hs.put("perPage", perPage);
			hs.put("curPage", curPage);
			pm.setMember(hs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		md.addObject("list", list);
		md.addObject("page", pm);
		md.setViewName("board/list");
		return md;
	}

	//글삭제
	public void delete(int num){
		try {
			boardDAO.delete(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//글수정
	public void update(BoardDTO bdDto){
		try {
			boardDAO.update(bdDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}







