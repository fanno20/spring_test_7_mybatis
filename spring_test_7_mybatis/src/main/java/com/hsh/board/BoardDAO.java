package com.hsh.board;

import org.springframework.ui.Model;

public interface BoardDAO {

	//글한개 가져오기
	public BoardDTO view(int num) throws Exception;
}
