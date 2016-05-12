package com.hsh.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
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
}
