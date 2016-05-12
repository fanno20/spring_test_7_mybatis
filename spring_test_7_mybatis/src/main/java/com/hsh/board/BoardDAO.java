package com.hsh.board;

import java.util.HashMap;
import java.util.List;

import org.springframework.ui.Model;

public interface BoardDAO {

	//글한개 가져오기
	public BoardDTO view(int num) throws Exception;
	
	//글쓰기
	public void write(BoardDTO bdDto) throws Exception;
	
	//글목록
	public List<BoardDTO> list(HashMap<String, Integer> hs) throws Exception;
	
	//전체 글 수 
	public int totalList() throws Exception;
	
	//글삭제
	public void delete(int num) throws Exception;
	
	//글수정
	public void update(BoardDTO bdDto) throws Exception;
}
