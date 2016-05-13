package com.hsh.team;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class TeamService {

	@Inject
	private TeamDAO teamDAO;
	
	public void insert(String[] ga, String[] na, String[] da){
		try {
			teamDAO.insert(ga, na, da);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TeamDTO createTeam(String ch){
		TeamDTO teamDTO=null;
		try {
			teamDTO = teamDAO.createTeam(ch);
		} catch (Exception e) {
			e.printStackTrace();
		};
		return teamDTO;
	}

}



