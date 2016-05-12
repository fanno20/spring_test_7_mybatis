package com.hsh.board;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

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

}
