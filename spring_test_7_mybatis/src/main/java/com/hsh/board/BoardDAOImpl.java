package com.hsh.board;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "BoardMapper.";
	
	@Override
	public BoardDTO view(int num) throws Exception{
		BoardDTO bdDto = sqlSession.selectOne(NAMESPACE+"view", num);
		return bdDto;
	}

	@Override
	public void write(BoardDTO bdDto) throws Exception {
		sqlSession.insert(NAMESPACE+"write", bdDto);

	}

	@Override
	public List<BoardDTO> list(HashMap<String, Integer> hs) throws Exception {
		List<BoardDTO> list = sqlSession.selectList(NAMESPACE+"list",hs);
		return list;
	}

	@Override
	public int totalList() throws Exception {
		return sqlSession.selectOne(NAMESPACE+"totlaList");
	}

	@Override
	public void delete(int num) throws Exception {
		sqlSession.delete(NAMESPACE+"delete", num);
	}

	@Override
	public void update(BoardDTO bdDto) throws Exception {
		sqlSession.delete(NAMESPACE+"update", bdDto);
	}

}
