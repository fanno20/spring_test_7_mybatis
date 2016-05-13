package com.hsh.team;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDAOImpl implements TeamDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE = "TeamMapper.";
	
	@Override
	public void insert(String[] ga, String[] na, String[] da) throws Exception {
		
		for(int i=0;i<ga.length;i++){
			TeamDTO teamDTO = new TeamDTO();
			teamDTO.setId(ga[i]);
			teamDTO.setName("ga");
			teamDTO.setPws(ga[i]);
			sqlSession.insert(NAMESPACE+"insert", teamDTO);
		}
		for(int i=0;i<na.length;i++){
			TeamDTO teamDTO = new TeamDTO();
			teamDTO.setId(na[i]);
			teamDTO.setName("na");
			teamDTO.setPws(na[i]);
			sqlSession.insert(NAMESPACE+"insert", teamDTO);
		}
		for(int i=0;i<da.length;i++){
			TeamDTO teamDTO = new TeamDTO();
			teamDTO.setId(da[i]);
			teamDTO.setName("da");
			teamDTO.setPws(da[i]);
			sqlSession.insert(NAMESPACE+"insert", teamDTO);
		}
	}

	@Override
	public TeamDTO createTeam(String ch) throws Exception {
		TeamDTO teamDTO = new TeamDTO();
		teamDTO.setName(ch);
		teamDTO = sqlSession.selectOne(NAMESPACE+"createTeam", teamDTO);
		sqlSession.delete(NAMESPACE+"delete", teamDTO);
		return teamDTO;
	}

}
